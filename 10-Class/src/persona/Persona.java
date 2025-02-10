package persona;

//* Define the class
public class Persona {
    //* Define the atributes
    public String name;
    public String LastName;
    public String email;
    public int phoneNumber;

    //* Void Constructor
    public Persona() {}

    //* Constructor with parameters
    public Persona(String name, String LastName){
        this.name = name;
        this.LastName = LastName;
    }

    //* Define the function
    public void showPerson(){
        System.out.println("Name: " + this.name);
        System.out.println("Last Name: " + this.LastName);
        System.out.println("Email: " + this.email);
        System.out.println("Phone Number: " + this.phoneNumber);
    }

}
