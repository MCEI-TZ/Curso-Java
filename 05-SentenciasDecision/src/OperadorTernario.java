import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        var numero = Integer.parseInt(scanner.nextLine());
        var resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar";
        System.out.println(resultado);

    }
}
