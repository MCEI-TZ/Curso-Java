package main;

import data.PersonaDAO;
import domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class HibernatePU {
    public static void main(String[] args) {
        var person = new PersonaDAO();
        //* List people
        person.listPeople();
    }
}
