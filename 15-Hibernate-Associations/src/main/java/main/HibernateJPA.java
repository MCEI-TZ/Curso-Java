package main;

import data.AddressDAO;
import domain.Address;

import java.util.Scanner;

public class HibernateJPA {
    public static void main(String[] args) {
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
