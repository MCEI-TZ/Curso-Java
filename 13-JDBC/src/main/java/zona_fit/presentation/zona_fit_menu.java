package zona_fit.presentation;

import zona_fit.data.ClienteDAO;
import zona_fit.data.IClienteDAO;
import zona_fit.domain.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zona_fit_menu {
    public static void main(String[] args) {

        try {
            var scan = new Scanner(System.in);
            IClienteDAO clienteDAO = new ClienteDAO();
            var exit = false;

            while (!exit) {
                System.out.println("----------Zona FIT MENU----------");
                System.out.println("""
                Select an option:
                1. List clients
                2. Search client by ID
                3. Create client
                4. Update client
                5. Delete client
                6. Exit
                
                Select an option:
                """);
                int option = Integer.parseInt(scan.nextLine());

                switch (option) {
                    case 1 -> {
                        var clients = clienteDAO.listClients();
                        System.out.println("-------------List of Clients-------------------");
                        clients.forEach(System.out::println);
                    }
                    case 2 -> {
                        System.out.println("Insert the IdCliente that you want to research: ");
                        var idClientList = Integer.parseInt(scan.nextLine());
                        var client = new Cliente(idClientList);
                        clienteDAO.listById(client);
                        System.out.println("-----IdClient found it:------");
                        System.out.println(client);
                    }
                    case 3 -> {
                        System.out.println("Insert the data of the cliente: ");
                        System.out.println("Name:");
                        var name = scan.nextLine();
                        System.out.println("LastName:");
                        var lastName = scan.nextLine();
                        System.out.println("Membresy:");
                        var membresy = Integer.parseInt(scan.nextLine());
                        var newClient = new Cliente(name, lastName, membresy);
                        clienteDAO.addCliente(newClient);
                        System.out.println("----Client created sucessfully----");
                    }
                    case 4 -> {
                        System.out.println("Insert the data of the cliente that you want to update: ");
                        System.out.println("IdCliente:");
                        var idClientUpdate = Integer.parseInt(scan.nextLine());
                        System.out.println("Name:");
                        var nameUpdate = scan.nextLine();
                        System.out.println("LastName:");
                        var lastNameUpdate = scan.nextLine();
                        System.out.println("Membresy:");
                        var membresyUpdate = Integer.parseInt(scan.nextLine());
                        var updatedClient = new Cliente(idClientUpdate, nameUpdate, lastNameUpdate, membresyUpdate);
                        clienteDAO.updateCliente(updatedClient);
                        System.out.println("----Client updated sucessfully----");
                    }
                    case 5 -> {
                        System.out.println("Insert the IdCliente that you want to delete: ");
                        var idClientDelete = Integer.parseInt(scan.nextLine());
                        var deletedClient = new Cliente(idClientDelete);
                        clienteDAO.deleteCliente(deletedClient);
                        System.out.println("----Client deleted sucessfully----");
                    }
                    case 6 -> exit = true;
                    default -> System.out.println("Invalid option");
                }
            }

        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
