package persona;

//* Define the class
public class Persona {

    public static int contadorPerson = 0;
    //* Define the atributes
    private String name;
    private String LastName;
    private String email;
    private int phoneNumber;

    //* Void Constructor
    public Persona() {
        Persona.contadorPerson++;
    }

    //* Constructor with parameters
    public Persona(String name, String LastName){
        this.name = name;
        this.LastName = LastName;
        Persona.contadorPerson++;
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

    //* Override toString method to show the object info
    @Override
    public String toString() {
        return "Persona{" +
                "name='" + this.name + '\'' +
                ", LastName='" + this.LastName + '\'' +
                ", email='" + this.email + '\'' +
                ", phoneNumber=" + this.phoneNumber +
                '}';
    }
}
