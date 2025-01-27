import java.util.Scanner;

public class LecturaConsola {
    public static void main(String[] args) {
        //! Lecutra de diferentes datos con la clase Scanner

        var scanner = new Scanner(System.in);
        //* Lecutra de numeros enteros
        System.out.println("Ingrese numeros enteros");
        var numeroEntero = scanner.nextInt();
        System.out.println("numeroEntero = " + numeroEntero);
        var numeroLong = scanner.nextLong(); //? Se puede hacer con el método long tambien
        System.out.println("numeroLong = " + numeroLong);

        //* Lectura de numeros deciamales
        System.out.println("Ingrese el valor de PI");
        var numeroDecimal = scanner.nextFloat();
        System.out.println("numeroDecimal = " + numeroDecimal);
        var numeroDouble = scanner.nextDouble();
        System.out.println("numeroDouble = " + numeroDouble);

        //! Nota las deciamales solo funcian con comas no puntos
        //! Tambien si se usa los metodos anteriores hay que tomar en cuanta que no consumen el salto de linea
        scanner.nextLine();

        //* Lectura de cadenas
         System.out.println("Ingrese su nombre");
        var nombre = scanner.nextLine(); //? Se necesita este método para leer la cadena completa
        System.out.println("nombre = " + nombre);
    }
}
