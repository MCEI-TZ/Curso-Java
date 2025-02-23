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

    public void insertPerson(Persona person){
        try{
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        }
        catch (Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
    }

    public void updatePerson(Persona person){
        try{
            em.getTransaction().begin();
            em.merge(person);
            em.getTransaction().commit();
        }
        catch (Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
    }

    public Persona searchPersonById(Persona p){
            Persona persona = em.find(Persona.class, p.getIdPersona());
            System.out.println(persona);
            return persona;
    }

    public void deletePerson(Persona p){
        try{
            em.getTransaction().begin();
            Persona persona = em.find(Persona.class, p.getIdPersona());
            em.remove(persona);
            em.getTransaction().commit();
        }
        catch (Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
    }
}
