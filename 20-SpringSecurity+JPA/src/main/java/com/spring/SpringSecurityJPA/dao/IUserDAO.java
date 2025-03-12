package com.spring.SpringSecurityJPA.dao;


import com.spring.SpringSecurityJPA.domain.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDAO extends JpaRepository<UserProfile, Long> {
    UserProfile findByUsername(String username);
}
