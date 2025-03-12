package com.spring.SpringSecurityJPA.services;

import com.spring.SpringSecurityJPA.dao.IPersonDAO;
import com.spring.SpringSecurityJPA.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonImp implements PersonService{

    @Autowired
    private IPersonDAO personaDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Person> listPeople() {
        return (List<Person>) personaDAO.findAll();
    }

    @Override
    @Transactional
    public void savePerson(Person person) {
        personaDAO.save(person);
    }

    @Override
    @Transactional
    public void deletePerson(Person person) {
        personaDAO.delete(person);
    }

    @Override
    @Transactional(readOnly = true)
    public Person findPerson(Person person) {

        return personaDAO.findById(person.getIdPerson()).orElse(null);
    }
}
