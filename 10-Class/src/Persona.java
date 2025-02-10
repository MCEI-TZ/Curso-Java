//* Define the class
public class Persona {
    //* Define the atributes
    private String name;
    private String LastName;
    private String email;
    private int phoneNumber;

    //* Void Constructor
    public Persona() {}

    //* Constructor with parameters
    public Persona(String name, String LastName){
        this.name = name;
        this.LastName = LastName;
    }

    //* Define the function
    void showPerson(){
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + LastName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        System.out.println("Creation of Object Persona");
        var person1 = new Persona();
        //* Create a new Persona
        person1.name = "John";
        person1.LastName = "Doe";
        person1.email = "johndoe@example.com";
        person1.phoneNumber = 1234567890;
        //* Show the details of the person1
        person1.showPerson();

        //* Create a new person
        var persona2 = new Persona();
        persona2.name = "Jane";
        persona2.LastName = "Smith";
        persona2.email = "janesmith@example.com";
        persona2.phoneNumber = 1876543210;
        //* Show the details of the persona2
        persona2.showPerson();

        //* Create a new persona with Constructors
        var person3 = new Persona("Pedro","Lopez");
        person3.showPerson();
    }
}
