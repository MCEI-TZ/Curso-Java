package com.spring.SpringSecurityJPA.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //? Indica que esta clase contiene configuraciones de beans para Spring.
@EnableWebSecurity //? Habilita la seguridad web de Spring Security.
public class SecurityConfig {

    //? Define el bean que configura la cadena de filtros de seguridad para las peticiones HTTP.
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                //* Configura la autorización de las peticiones HTTP:
                .authorizeHttpRequests(authorizeRequest -> authorizeRequest
                        //* Configura la página de login personalizada para que acepte cualquier peticion
                        .requestMatchers("/login", "/resources/**").permitAll()
                        //* Configura ciertas apis en las que para acceder aparte de la autenticacion requiere tener un rol especifico, sino lo tiene se tiene que autenticar
                        .requestMatchers("/add/**", "/edit/**", "/delete/**").hasRole("ADMIN")
                        //* Requiere que cualquier solicitud esté autenticada.
                        .anyRequest().authenticated()
                )
                //* Configura el login mediante formulario:
                .formLogin(formLogin ->
                        formLogin
                                //* Se asigna el link de la página del login personalizado
                                .loginPage("/login")
                                //* Redirecciona a la pagina de principal si el login es exitoso
                                .defaultSuccessUrl("/", true)
                                //* Permite el acceso a la página de login a todos los usuarios.
                                .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout")
                )
                .exceptionHandling(exceptionHandling -> exceptionHandling
                        .accessDeniedPage("/errors/403")
                );

        //* Construye y retorna la cadena de filtros de seguridad.
        return httpSecurity.build();
    }

    //? Define el bean que maneja los detalles de los usuarios para la autenticación.
    @Bean
    public UserDetailsService userDetailsService() {
        //* Crea un usuario con nombre "user", contraseña "123" (codificada) y rol "USER".
        UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder().encode("123"))
                .roles("USER") //* Rol asignado: USER
                .build();

        //* Crea un usuario administrador con nombre "admin", contraseña "123" (codificada) y roles "ADMIN" y "USER".
        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder().encode("123"))
                .roles("ADMIN", "USER") // Roles asignados: ADMIN y USER
                .build();

        //* Registra ambos usuarios en un administrador en memoria (ideal para pruebas y desarrollo).
        return new InMemoryUserDetailsManager(user, admin);
    }

    //? Define el bean que codifica las contraseñas utilizando BCrypt.
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
