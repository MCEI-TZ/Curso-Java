public class BreakContinue {
    public static void main(String[] args) {
        //* Break y continue

        //? Este código muestra un ciclo for que imprime los números del 1 al 10, pero en este caso utiliza break para salir del ciclo cuando se encuentra el número 5
        //* Break
        System.out.println("------------------------------");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("El número es: " + i);
        }
        //* continue
        //* Imprimir pares
        System.out.println("Impresion de pares con continue:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { //* Condicion para impar
                continue;
            }
            System.out.println("El número par es: " + i);
        }

    }
}
