package persona;

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
    public void showPerson(){
        System.out.println("Name: " + this.name);
        System.out.println("Last Name: " + this.LastName);
        System.out.println("Email: " + this.email);
        System.out.println("Phone Number: " + this.phoneNumber);
    }

    //* Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
