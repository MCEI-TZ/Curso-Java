import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        //* Receta de Cocina
        var scanner = new Scanner(System.in);

        System.out.println("\t-----Sistema de Recetas de Cocina, simple-----");
        System.out.println("Ingrese el nombre de la Receta de Cocina");
        var recetaNombre = scanner.nextLine();
        System.out.println("Ingrese ingredientes principales");
        var ingredientesPrincipales = scanner.nextLine();
        System.out.println("Ingrese tiempo de preparation");
        var tiempoPreparation = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el nivel de Dificultad (Facil, media, ALta)");
        var dificultad = scanner.nextLine();

        System.out.println("\t----Receta de Cocina------");
        System.out.println("Nombre de Receta = " + recetaNombre);
        System.out.println("Ingredientes principales = " + ingredientesPrincipales);
        System.out.println("Tiempo de Preparation = " + tiempoPreparation + " minutos");
        System.out.println("Nivel de Dificultad = " + dificultad);
    }
}
