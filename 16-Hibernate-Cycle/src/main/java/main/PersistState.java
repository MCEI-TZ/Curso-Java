package main;

import domain.Contact;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersistState {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPA-Cycle");
        EntityManager em = emf.createEntityManager();

        //? 1- Transitive state
        Contact contact = new Contact();
        contact.setPhone("0987654321");
        contact.setEmail("general@example.com");

        //? 2 - persistent state
        em.getTransaction().begin();
        em.persist(contact);
        em.getTransaction().commit();

        //? 3 - Detached state
        System.out.println("contact = " + contact);
    }
}
