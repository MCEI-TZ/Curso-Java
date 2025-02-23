package main;

import data.AddressDAO;
import data.ContactDAO;
import data.CourseDAO;
import data.StudentDAO;
import domain.Address;
import domain.Contact;
import domain.Course;
import domain.Student;

import java.util.Scanner;

public class HibernateJPA {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var exit = false;
        System.out.println("""
                1. Addresses
                2. Contacts
                3. Course
                4. Students
                5. Exit
                
                Please enter your choice:
                """);
        var intChoice = Integer.parseInt(scan.nextLine());

        switch (intChoice){
            case 1 -> AddressOperations();
            case 2 -> ContactOperations();
            case 3 -> CourseOperations();
            case 4 -> StudentOperations();
            case 5 -> exit = true;
            default -> System.out.println("Invalid option. Please try again.");
        }
    }
    public static void StudentOperations(){
        var exit= false;
        var scan = new Scanner(System.in);
        var studentDAO = new StudentDAO();
        var addressDAO = new AddressDAO();
        var contactDAO = new ContactDAO();

        while (!exit){
            System.out.println("""
                    ******---Main Menu--******
                    
                    1. List student
                    2. Search student by Id
                    3. Insert Student
                    4. Update Student
                    5. Delete Student
                    6. Exit
                    
                    Please enter your choice:
                    """);
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice){
                case 1 -> studentDAO.listStudents(); //* List students
                case 2 -> {
                    System.out.println("--Provide the id of the student you want to search--");
                    int idStudent = Integer.parseInt(scan.nextLine());

                    var student1 = new Student();
                    student1.setIdStudent(idStudent);

                    studentDAO.SearchStudentById(student1);
                }
                case 3 -> { //* Insert student
                    System.out.println("---Provide the data for the student---\n");

                    System.out.println("Enter idAddress:");
                    int idAddress = Integer.parseInt(scan.nextLine());
                    var address = new Address();
                    address.setIdAdress(idAddress);

                    System.out.println("Enter idContact:");
                    int idContact = Integer.parseInt(scan.nextLine());
                    var contact = new Contact();
                    contact.setIdContact(idContact);

                    System.out.println("Enter student name:");
                    String name = scan.nextLine();

                    System.out.println("Enter student last name:");
                    String lastName = scan.nextLine();

                    var student2 = new Student();
                    student2.setName(name);
                    student2.setLastName(lastName);
                    student2.setAddress(address);
                    student2.setContact(contact);

                    studentDAO.addStudent(student2);
                    System.out.println("\n\t----Student created successfully----");
                }

                case 4 -> { //* Update student
                    System.out.println("--Provide the id of the student you want to update--");
                    int idStudent = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter idAddress:");
                    int idAddress = Integer.parseInt(scan.nextLine());
                    var address = new Address();
                    address.setIdAdress(idAddress);

                    System.out.println("Enter idContact:");
                    int idContact = Integer.parseInt(scan.nextLine());
                    var contact = new Contact();
                    contact.setIdContact(idContact);

                    System.out.println("Enter student name:");
                    String name = scan.nextLine();

                    System.out.println("Enter student last name:");
                    String lastName = scan.nextLine();

                    var student3 = new Student();
                    student3.setIdStudent(idStudent);
                    student3 = studentDAO.SearchStudentById(student3);

                    student3.setAddress(address);
                    student3.setContact(contact);
                    student3.setName(name);
                    student3.setLastName(lastName);
                    studentDAO.updateStudent(student3);
                    System.out.println("\n\t----course updated successfully----");

                }
                case 5 ->{
                    System.out.println("--Provide the id of the student you want to delete--");
                    int idStudent = Integer.parseInt(scan.nextLine());

                    var student4 = new Student();
                    student4.setIdStudent(idStudent);

                    studentDAO.deleteStudent(student4);
                    System.out.println("\n\t----student deleted successfully----");
                }
                case 6 -> exit = true;

                default -> System.out.println("Invalid option");
            }
        }
    }

    public static void CourseOperations(){
        var exit= false;
        var scan = new Scanner(System.in);
        var courseDAO = new CourseDAO();

        while (!exit){
            System.out.println("""
                    ******---Main Menu--******
                    
                    1. List courses
                    2. Search Course by Id
                    3. Insert Course
                    4. Update Course
                    5. Delete Course
                    6. Exit
                    
                    Please enter your choice:
                    """);
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice){
                case 1 -> courseDAO.listCourses(); //* List courses
                case 2 -> {
                    System.out.println("--Provide the id of the course you want to search--");
                    int idCourse = Integer.parseInt(scan.nextLine());

                    Course course1 = new Course();
                    course1.setIdCourse(idCourse);

                    courseDAO.searchById(course1);
                }
                case 3 -> { //* Insert course
                    System.out.println("---Provide the data for the course---\n");
                    System.out.println("Enter name:");
                    String name = scan.nextLine();
                    System.out.println("Enter price:");
                    var price = Double.parseDouble(scan.nextLine());

                    var course2 = new Course();
                    course2.setName(name);
                    course2.setPrice(price);

                    courseDAO.addCourse(course2);
                    System.out.println("\n\t----course created successfully----");
                }
                case 4 -> { //* Update course
                    System.out.println("--Provide the id of the course you want to update--");
                    int idCourse = Integer.parseInt(scan.nextLine());

                    System.out.println("Enter name:");
                    String name = scan.nextLine();
                    System.out.println("Enter price:");
                    var price = Double.parseDouble(scan.nextLine());

                    var course3 = new Course();
                    course3.setIdCourse(idCourse);
                    course3 = courseDAO.searchById(course3);

                    course3.setName(name);
                    course3.setPrice(price);
                    courseDAO.updateCourse(course3);
                    System.out.println("\n\t----course updated successfully----");

                }
                case 5 ->{
                    System.out.println("--Provide the id of the course you want to delete--");
                    int idCourse = Integer.parseInt(scan.nextLine());

                    var course4 = new Course();
                    course4.setIdCourse(idCourse);

                    courseDAO.deleteCourse(course4);
                    System.out.println("\n\t----course deleted successfully----");
                }
                case 6 -> exit = true;

                default -> System.out.println("Invalid option");
            }
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
