import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        var nombre = scanner.nextLine();
        System.out.println("Escribe tu apellido");
        var apellido = scanner.nextLine();

        var nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.println("nombreCompleto = " + nombreCompleto);
    }
}
