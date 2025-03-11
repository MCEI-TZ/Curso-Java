package com.spring.SpringSecurityJPA.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptPassword {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        var password = "123";
        var encodedPassword = encodePassword(password);
        System.out.println("Encoded password: " + encodedPassword);
    }

    public static String encodePassword(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }
}
