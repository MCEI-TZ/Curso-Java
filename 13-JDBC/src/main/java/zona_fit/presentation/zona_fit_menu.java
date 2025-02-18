package zona_fit.presentation;

import zona_fit.data.ClienteDAO;
import zona_fit.domain.Cliente;

import java.util.Scanner;

public class zona_fit_menu {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var domainOptions = new ClienteDAO();
        var exit = false;

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

        try {
            while (!exit) {
                switch (option) {
                    case 1 -> domainOptions.listClients();
                    case 2 -> {
                        System.out.println("Insert the IdCliente that you want to research: ");
                        var idClientList = Integer.parseInt(scan.nextLine());
                        var client = new Cliente(idClientList);
                        domainOptions.listById(client);
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
                        domainOptions.addCliente(newClient);
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
                        domainOptions.updateCliente(updatedClient);
                    }
                    case 5 -> {
                        System.out.println("Insert the IdCliente that you want to delete: ");
                        var idClientDelete = Integer.parseInt(scan.nextLine());
                        var deletedClient = new Cliente(idClientDelete);
                        domainOptions.deleteCliente(deletedClient);
                    }
                    case 6 -> exit = true;
                }
            }

        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
