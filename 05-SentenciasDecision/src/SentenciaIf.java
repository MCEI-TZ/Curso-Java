import java.util.Scanner;

public class SentenciaIf {
    public static void main(String[] args) {
        //* Sentencia if
        var scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        var edad = scanner.nextLine();

        if (Integer.parseInt(edad) >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

    }
}
