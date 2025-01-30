import java.util.Scanner;

public class EjemplosOperadores {
    public static void main(String[] args) {
        //*Determinar si esta dentro de cierto rango
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero inicial: ");
        int numInicial = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese un numero final: ");
        int numFinal = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese un numero a verificar tu rango: ");
        int numVerificar = Integer.parseInt(scanner.nextLine());

        boolean estaDentroDeRango = numVerificar >= numInicial && numVerificar <= numFinal;
        System.out.println("Tu numero: " + (estaDentroDeRango?"Esta dentro del rango": "Esta fuera del rango"));


    }
}
