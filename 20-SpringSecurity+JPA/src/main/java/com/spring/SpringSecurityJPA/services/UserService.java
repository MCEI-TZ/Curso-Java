package com.spring.SpringSecurityJPA.services;

import com.spring.SpringSecurityJPA.dao.IUserDAO;
import com.spring.SpringSecurityJPA.domain.Rol;
import com.spring.SpringSecurityJPA.domain.UserProfile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("userDetailsService")
@Slf4j
public class UserService implements UserDetailsService {

    @Autowired
    private IUserDAO iUserDAO;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserProfile userProfile = iUserDAO.findByUsername(username);

        if(userProfile == null){
            throw new UsernameNotFoundException("Username not found");
        }
        var rols = new ArrayList<GrantedAuthority>();

        for(Rol rol: userProfile.getRols()){
            rols.add(new SimpleGrantedAuthority(rol.getName()));
        }

        return new User(userProfile.getUsername(), userProfile.getPassword(),rols);
    }
}
