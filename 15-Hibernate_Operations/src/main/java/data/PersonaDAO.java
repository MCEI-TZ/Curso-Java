package data;

import domain.Persona;
import jakarta.persistence.*;

import java.util.List;

public class PersonaDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO(){
        emf= Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public void listPeople(){
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for(Persona p: personas){
            System.out.println(p);
        }
    }

    public void InsertPerson(Persona person){
        try{
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        }
        catch (Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
        finally {
            em.close();
            emf.close();
        }
    }
}
