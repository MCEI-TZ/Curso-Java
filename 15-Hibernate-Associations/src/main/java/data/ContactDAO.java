package data;

import domain.Contact;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ContactDAO {
    EntityManagerFactory emf;
    EntityManager em;

    public ContactDAO(){
        emf = Persistence.createEntityManagerFactory("HibernateJPA-PU");
        em = emf.createEntityManager();
    }

    public void listContacts(){
        String hql = "SELECT p FROM Contact p";
        Query query = em.createQuery(hql);
        List<Contact> contacts = query.getResultList();
        for(Contact contact: contacts){
            System.out.println(contact);
        }
    }

    public Contact searchContactById(Contact con){
        var contact = em.find(Contact.class,con.getIdContact());
        System.out.println(contact);
        return contact;
    }

    public void addContact(Contact con){
        em.getTransaction().begin();
        em.persist(con);
        em.getTransaction().commit();
    }

    public void updateContact(Contact con){
        em.getTransaction().begin();
        em.merge(con);
        em.getTransaction().commit();
    }

    public void deleteContact(Contact con){
        em.getTransaction().begin();
        Contact contact = em.find(Contact.class, con.getIdContact());
        em.remove(contact);
        em.getTransaction().commit();
    }
}
