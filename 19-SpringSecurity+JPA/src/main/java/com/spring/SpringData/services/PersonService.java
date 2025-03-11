package com.spring.SpringData.services;

import com.spring.SpringData.domain.Person;

import java.util.List;

public interface  PersonService {
    public List<Person> listPeople();
    public void savePerson(Person person);
    public void deletePerson(Person person);
    public Person findPerson(Person person);
}
