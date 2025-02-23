package domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "assignment")
public class Assignment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name="id_assignment")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAssignment;

    @JoinColumn(name = "id_student", referencedColumnName = "id_student")
    @ManyToOne
    private Student student;

    @JoinColumn(name = "id_course", referencedColumnName = "id_course")
    @ManyToOne
    private Course course;

    private String session;

    public Assignment(){}

    public Assignment(Integer idAssignment){
        this.idAssignment = idAssignment;
    }

    public Integer getIdAssignment() {
        return idAssignment;
    }

    public void setIdAssignment(Integer idAssignment) {
        this.idAssignment = idAssignment;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "idAssignment=" + idAssignment +
                ", student=" + student +
                ", course=" + course +
                ", session='" + session + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return Objects.equals(idAssignment, that.idAssignment);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idAssignment);
    }
}
