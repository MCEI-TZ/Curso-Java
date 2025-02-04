import java.util.Scanner;

public class MenuIterativo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("*** Sistema de Administracion de Cuentas ***");
        var salida = false;

        while(!salida){
            System.out.println("""
                    Seleccione una opcion:
                    1. Crear Cuenta
                    2. Modificar Cuenta
                    3. Eliminar Cuenta
                    4. Salir
                """);
            System.out.println(" Opcion: ");

            var opcion = Integer.parseInt(scanner.nextLine());

            switch(opcion){
                case 1 -> System.out.println("Creando cuenta ...");
                case 2 -> System.out.println("Modificando cuenta ...");
                case 3 -> System.out.println("Eliminando cuenta ...");
                case 4 -> salida = true;
                default -> System.out.println("Opcion invalida. Intente de nuevo.");
            }
        }
    }
}
