package trial;

import domain.Persona;
import jakarta.persistence.*;

import java.util.List;

public class HibernateProof {
    public static void main(String[] args) {
        String hql = "SELECT p FROM Persona p";
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("HibernateExample1");
        EntityManager entityManager = factory.createEntityManager();

        Query query = entityManager.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
