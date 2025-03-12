package com.spring.SpringSecurityJPA.services;

import com.spring.SpringSecurityJPA.domain.Person;

import java.util.List;

public interface  PersonService {
    public List<Person> listPeople();
    public void savePerson(Person person);
    public void deletePerson(Person person);
    public Person findPerson(Person person);
}
