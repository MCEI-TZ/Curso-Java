import java.util.Scanner;

public class SentenciaIf {
    public static void main(String[] args) {
        //* Sentencia if-else
        var scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        var edad = scanner.nextLine();

        if (Integer.parseInt(edad) >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        
        //* Sentencia if-else else if

        System.out.println("Ingrese su edad");
        var edad1 = Integer.parseInt(scanner.nextLine());

        if (edad1 >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (edad1 >= 13 && edad1 <18) {
            System.out.println("Eres adolecente");
        } else {
            System.out.println("Eres menor de edad");
        }

    }
}
