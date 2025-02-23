package data;

import domain.Contact;
import domain.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class CourseDAO {
    EntityManagerFactory emf;
    EntityManager em;

    public CourseDAO(){
        emf = Persistence.createEntityManagerFactory("HibernateJPA-PU");
        em = emf.createEntityManager();
    }

    // Add, update, delete, and list methods here...

    public void listCourses(){
        String hql = "SELECT p FROM Course p";
        Query query = em.createQuery(hql);
        List<Course> courses = query.getResultList();
        for (Course course: courses){
            System.out.println(course);
        }
    }

    public Course searchById(Course cou){
        var courseSearch = em.find(Course.class,cou.getIdCourse());
        System.out.println(courseSearch);
        return courseSearch;
    }

    public void addCourse(Course cou){
        em.getTransaction().begin();
        em.persist(cou);
        em.getTransaction().commit();
    }

    public void updateCourse(Course cou){
        try{
            em.getTransaction().begin();
            em.merge(cou);
            em.getTransaction().commit();
        }
        catch (Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
    }

    public void deleteCourse(Course cou){
        em.getTransaction().begin();
        Course course = em.find(Course.class, cou.getIdCourse());
        em.remove(course);
        em.getTransaction().commit();
    }
}
