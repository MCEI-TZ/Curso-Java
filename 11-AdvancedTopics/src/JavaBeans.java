import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setLastName("Doe");
        System.out.println("Name: " + person.getName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println(person);
    }
}

class Person implements Serializable {
    private String name;
    private String LastName;
    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
