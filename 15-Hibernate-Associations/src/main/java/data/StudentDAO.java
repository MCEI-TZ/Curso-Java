package data;

import domain.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.awt.geom.QuadCurve2D;

public class StudentDAO {
    EntityManagerFactory emf;
    EntityManager em;

    public StudentDAO(){
        emf = Persistence.createEntityManagerFactory("HibernateJPA-PU");
        em = emf.createEntityManager();
    }

    public void listStudents(){
        String hql = "SELECT s FROM Student s";
        Query query = em.createQuery(hql);
        var students = query.getResultList();
        for(var student: students){
            System.out.println(student);
        }
    }

    public void SearchStudentById(Student student){
        em.getTransaction().begin();
        var students = em.find(Student.class, student.getIdStudent());
        em.getTransaction().commit();
        System.out.println(students);
    }

    public void addStudent(Student student){
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
    }

    public void updateStudent(Student student){
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
    }

    public void deleteStudent(Student student){
        em.getTransaction().begin();
        Student student1 = em.find(Student.class, student.getIdStudent());
        em.remove(student1);
        em.getTransaction().commit();
    }
}
