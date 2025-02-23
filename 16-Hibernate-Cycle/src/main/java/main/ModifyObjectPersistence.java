package main;

import domain.Contact;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ModifyObjectPersistence {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPA-Cycle");
        EntityManager em = emf.createEntityManager();

        //? Define a variable that will receive the persistence object from the database
        Contact contact = null;

        //? Reclaim the persistence object from the database

        //* 1 Detache state
        contact = em.find(Contact.class, 4);
        //?Begin of the transaction
        em.getTransaction().begin();
        //? Modify the state of the persistence object
        contact.setEmail("example@gmail.com");
        em.merge(contact);
        //? End of the transaction
        em.getTransaction().commit();

        //? Detached
        System.out.println("contact = " + contact);


    }
}
