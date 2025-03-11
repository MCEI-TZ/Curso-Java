package com.spring.SpringSecurityJPA.dao;


import com.spring.SpringSecurityJPA.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonDAO extends CrudRepository<Person, Long> {
}
