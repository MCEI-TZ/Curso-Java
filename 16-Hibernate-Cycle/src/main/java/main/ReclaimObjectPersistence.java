package main;

import domain.Contact;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ReclaimObjectPersistence {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPA-Cycle");
        EntityManager em = emf.createEntityManager();

        //? Define a variable that will receive the persistence object from the database
        Contact contact = null;

        //? Reclaim the persistence object from the database
        contact = em.find(Contact.class, 4);

        //? Detached
        System.out.println("contact = " + contact);
        

    }
}
