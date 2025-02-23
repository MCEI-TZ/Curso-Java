package main;

import data.PersonaDAO;
import domain.Persona;

import java.util.Scanner;

public class HibernatePU {
    public static void main(String[] args) {
        var exit= false;
        var scan = new Scanner(System.in);
        var person = new PersonaDAO();

        while (!exit){
            System.out.println("""
                    ******---Main Menu--******
                    
                    1. List People
                    2. Search People by Id
                    3. Insert Person
                    4. Update Person
                    5. Delete Person
                    6. Exit
                    
                    Please enter your choice:
                    """);
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice){
                case 1 -> person.listPeople(); //* List people
                case 2 -> {
                    System.out.println("--Provide the id of the person you want to search--");
                    int idPersona = Integer.parseInt(scan.nextLine());

                    Persona person1 = new Persona();
                    person1.setIdPersona(idPersona);

                    person.searchPersonById(person1);
                }
                case 3 -> { //* Insert person
                    System.out.println("---Provide the data for the person---\n");
                    System.out.println("Enter Name:");
                    String name = scan.nextLine();
                    System.out.println("Enter Last Name:");
                    String lastName = scan.nextLine();
                    System.out.println("Enter Email:");
                    String email = scan.nextLine();
                    System.out.println("Enter Phone:");
                    String phone = scan.nextLine();

                    Persona person2 = new Persona();
                    person2.setName(name);
                    person2.setLastName(lastName);
                    person2.setEmail(email);
                    person2.setPhone(phone);

                    person.insertPerson(person2);
                    System.out.println("\n\t----person created successfully----");
                }
                case 4 -> { //* Update person
                    System.out.println("--Provide the id of the person you want to update--");
                    int idPersona = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter Name:");
                    String name = scan.nextLine();
                    System.out.println("Enter Last Name:");
                    String lastName = scan.nextLine();
                    System.out.println("Enter Email:");
                    String email = scan.nextLine();
                    System.out.println("Enter Phone:");
                    String phone = scan.nextLine();

                    Persona person3 = new Persona();
                    person3.setIdPersona(idPersona);
                    person3 = person.searchPersonById(person3);

                    person3.setName(name);
                    person3.setLastName(lastName);
                    person3.setEmail(email);
                    person3.setPhone(phone);
                    person.updatePerson(person3);
                    System.out.println("\n\t----person updated successfully----");

                }
                case 5 ->{
                    System.out.println("--Provide the id of the person you want to delete--");
                    int idPersona = Integer.parseInt(scan.nextLine());

                    Persona person4 = new Persona();
                    person4.setIdPersona(idPersona);

                    person.deletePerson(person4);
                    System.out.println("\n\t----person deleted successfully----");
                }
                case 6 -> exit = true;

                default -> System.out.println("Invalid option");
            }
        }
    }
}