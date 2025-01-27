import java.util.Scanner;

public class FormateoCadenas {
    public static void main(String[] args) {
        //* Formateo de cadenas
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        var nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        var edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese su salario");
        var salario = Double.parseDouble(scanner.nextLine());

        //* Formateo con String.format()
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f",nombre,edad,salario);
        System.out.println(mensaje);
    }
}
