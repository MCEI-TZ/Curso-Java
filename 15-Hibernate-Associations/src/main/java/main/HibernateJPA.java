package main;

import data.AddressDAO;
import data.ContactDAO;
import domain.Address;
import domain.Contact;

import java.util.Scanner;

public class HibernateJPA {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var exit = false;
        System.out.println("""
                1. Addresses
                2. Contacts
                3. Exit
                
                Please enter your choice:
                """);
        var intChoice = Integer.parseInt(scan.nextLine());

        switch (intChoice){
            case 1 -> AddressOperations();
            case 2 -> ContactOperations();
            case 3 -> exit = true;
            default -> System.out.println("Invalid option. Please try again.");
        }
    }

    public static void ContactOperations(){
        var exit= false;
        var scan = new Scanner(System.in);
        var contactDAO = new ContactDAO();

        while (!exit){
            System.out.println("""
                    ******---Main Menu--******
                    
                    1. List Contacts
                    2. Search Contact by Id
                    3. Insert Contact
                    4. Update Contact
                    5. Delete Contact
                    6. Exit
                    
                    Please enter your choice:
                    """);
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice){
                case 1 -> contactDAO.listContacts(); //* List contacts
                case 2 -> {
                    System.out.println("--Provide the id of the contact you want to search--");
                    int idPersona = Integer.parseInt(scan.nextLine());

                    Contact contact1 = new Contact();
                    contact1.setIdContact(idPersona);

                    contactDAO.searchContactById(contact1);
                }
                case 3 -> { //* Insert contact
                    System.out.println("---Provide the data for the contact---\n");
                    System.out.println("Enter phone:");
                    String phone = scan.nextLine();
                    System.out.println("Enter email:");
                    String email = scan.nextLine();

                    var contact2 = new Contact();
                    contact2.setPhone(phone);
                    contact2.setEmail(email);

                    contactDAO.addContact(contact2);
                    System.out.println("\n\t----contact created successfully----");
                }
                case 4 -> { //* Update contact
                    System.out.println("--Provide the id of the address you want to update--");
                    int idContact = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter phone:");
                    String phone = scan.nextLine();
                    System.out.println("Enter email:");
                    String email = scan.nextLine();

                    var contact3 = new Contact();
                    contact3.setIdContact(idContact);
                    contact3 = contactDAO.searchContactById(contact3);

                    contact3.setPhone(phone);
                    contact3.setEmail(email);
                    contactDAO.updateContact(contact3);
                    System.out.println("\n\t----contact updated successfully----");

                }
                case 5 ->{
                    System.out.println("--Provide the id of the contact you want to delete--");
                    int idContact = Integer.parseInt(scan.nextLine());

                    Contact contact4 = new Contact();
                    contact4.setIdContact(idContact);

                    contactDAO.deleteContact(contact4);
                    System.out.println("\n\t----contact deleted successfully----");
                }
                case 6 -> exit = true;

                default -> System.out.println("Invalid option");
            }
        }

    }

    public static void AddressOperations(){
        var exit= false;
        var scan = new Scanner(System.in);
        var addressDAO = new AddressDAO();

        while (!exit){
            System.out.println("""
                    ******---Main Menu--******
                    
                    1. List Address
                    2. Search Address by Id
                    3. Insert Address
                    4. Update Address
                    5. Delete Address
                    6. Exit
                    
                    Please enter your choice:
                    """);
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice){
                case 1 -> addressDAO.listAddress(); //* List people
                case 2 -> {
                    System.out.println("--Provide the id of the address you want to search--");
                    int idPersona = Integer.parseInt(scan.nextLine());

                    Address address1 = new Address();
                    address1.setIdAdress(idPersona);

                    addressDAO.searchAddressById(address1);
                }
                case 3 -> { //* Insert person
                    System.out.println("---Provide the data for the address---\n");
                    System.out.println("Enter street:");
                    String street = scan.nextLine();
                    System.out.println("Enter N Street:");
                    String nStreet = scan.nextLine();
                    System.out.println("Enter Country:");
                    String country = scan.nextLine();

                    var address2 = new Address();
                    address2.setStreet(street);
                    address2.setnAddress(nStreet);
                    address2.setCountry(country);

                    addressDAO.addAddress(address2);
                    System.out.println("\n\t----address created successfully----");
                }
                case 4 -> { //* Update person
                    System.out.println("--Provide the id of the address you want to update--");
                    int idAddress = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter street:");
                    String street = scan.nextLine();
                    System.out.println("Enter N Street:");
                    String nStreet = scan.nextLine();
                    System.out.println("Enter Country:");
                    String country = scan.nextLine();

                    var address3 = new Address();
                    address3.setIdAdress(idAddress);
                    address3 = addressDAO.searchAddressById(address3);

                    address3.setStreet(street);
                    address3.setnAddress(nStreet);
                    address3.setCountry(country);
                    addressDAO.updateAddress(address3);
                    System.out.println("\n\t----address updated successfully----");

                }
                case 5 ->{
                    System.out.println("--Provide the id of the address you want to delete--");
                    int idAddress = Integer.parseInt(scan.nextLine());

                    Address address4 = new Address();
                    address4.setIdAdress(idAddress);

                    addressDAO.deleteAddress(address4);
                    System.out.println("\n\t----address deleted successfully----");
                }
                case 6 -> exit = true;

                default -> System.out.println("Invalid option");
            }
        }
    }
}
