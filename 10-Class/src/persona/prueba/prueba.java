package persona.prueba;

import persona.Persona;

public class prueba {
    public static void main(String[] args) {
        System.out.println("Creation of Object persona.Persona");
        //* Print count
        System.out.println("Total of people: "+ Persona.contadorPerson);

        var person1 = new Persona();
        //* Create a new persona.Persona
        person1.setName("John");
        person1.setLastName("Doe");
        person1.setEmail("johndoe@example.com");
        person1.setPhoneNumber(1234567890);
        //* Show the details of the person1
        System.out.println(person1.toString());

        Persona.CountPerson();

        //* Create a new person
        var persona2 = new Persona();
        persona2.setName("Jane");
        persona2.setLastName("Smith");
        persona2.setEmail("janesmith@example.com");
        persona2.setPhoneNumber(1876543210);
        //* Show the details of the persona2
        System.out.println(persona2.toString());

        Persona.CountPerson();

        //* Create a new persona with Constructors
        var person3 = new Persona("Pedro","Lopez");
        System.out.println(person3); //* if we don't call the method toString() then the IDE will check it if exists so it doesn't necessarily to call the method toString()

        Persona.CountPerson();


    }
}
