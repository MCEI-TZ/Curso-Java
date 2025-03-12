package com.spring.SpringSecurityJPA.dao;


import com.spring.SpringSecurityJPA.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonDAO extends JpaRepository<Person, Long> {
}
