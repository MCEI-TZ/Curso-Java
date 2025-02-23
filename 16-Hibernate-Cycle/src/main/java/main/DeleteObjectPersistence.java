package main;

import domain.Contact;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DeleteObjectPersistence {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPA-Cycle");
        EntityManager em = emf.createEntityManager();

        //? Define a variable that will receive the persistence object from the database
        Contact contact = null;

        //? Reclaim the persistence object from the database

        //* 1 Transitive state
        contact = em.find(Contact.class, 4);

        //?Begin of the transaction
        em.getTransaction().begin();
        //? Delete the persistence object from the database
        em.remove(contact);
        //? End of the transaction
        em.getTransaction().commit();

        //? transitive state
        System.out.println("contact = " + contact);

    }
}
