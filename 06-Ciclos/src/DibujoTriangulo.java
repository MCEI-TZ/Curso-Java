import java.util.Scanner;

public class DibujoTriangulo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Dibuja un triangulo");

        System.out.println("Ingrese el número de filas: ");

        int numFilas = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numFilas; i++){
            var espaciosblancos = " ".repeat(numFilas - i);
            var asteriscos = "*".repeat(2 * i -1);
            System.out.println(espaciosblancos + asteriscos);
        }
    }
}
