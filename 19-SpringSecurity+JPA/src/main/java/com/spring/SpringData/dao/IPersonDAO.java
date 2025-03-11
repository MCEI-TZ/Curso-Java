package com.spring.SpringData.dao;


import com.spring.SpringData.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonDAO extends CrudRepository<Person, Long> {
}
