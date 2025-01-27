import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        //* Generador de Id Unico

        var scanner = new Scanner(System.in);
        var random = new Random();

        System.out.println("Generador de Id Unico");
        System.out.println("Ingrese su nombre");
        var nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        var apellido = scanner.nextLine();
        System.out.println("Ingrese su año de nacimiento");
        var anioNacimiento = scanner.nextLine();

        var numeroAleatorio = random.nextInt(9999) + 1;

        var idUnico = nombre.toUpperCase().trim().substring(0,2) + apellido.toUpperCase().trim().substring(0,2)+ anioNacimiento.trim().substring(2)+ String.format("%04d",numeroAleatorio);
                
        System.out.printf("""
                ---\tDatos del registro
                Nombre: %s
                Apellido: %s
                Año de Nacimiento: %s
                Id Unico: %s
                """, nombre,apellido,anioNacimiento,idUnico);
    }
}
