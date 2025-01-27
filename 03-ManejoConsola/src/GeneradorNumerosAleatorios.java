import java.util.Random;
import java.util.Scanner;

public class GeneradorNumerosAleatorios {
    public static void main(String[] args) {
        //* Generador de numeros aleatorios

        var random = new Random();
        var scanner = new Scanner(System.in);

        System.out.println("Generando numeros aleatorios:");
        System.out.println("Ingrese un numero aleatorio entero entre 0 y 9");
        var numero = Integer.parseInt(scanner.nextLine());
        var numeroaleatorio =random.nextInt(numero);
        System.out.println("Numero aleatorio generado: " + numeroaleatorio);

        System.out.println("Generador de un numero aleatorio decimal");
        System.out.println("Ingrese un numero aleatorio entre 0 y 9");
        var numeroDecimal = Double.parseDouble(scanner.nextLine());
        var numeroAleatorioDecimal = random.nextDouble() * numeroDecimal;
        System.out.println("Numero aleatorio decimal generado: " + numeroAleatorioDecimal);

    }
}
