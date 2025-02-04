public class CicloFor {
    public static void main(String[] args) {
        //* Ciclo for

        //? Este código muestra un ciclo for que imprime los números del 1 al 10
        System.out.println("------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println("El número es: " + i);
        }

        //* Ciclo for con incremento en 2
        System.out.println("------------------------------");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("El número es: " + i);
        }

        //* Ciclo for con decremento en 2
        System.out.println("------------------------------");
        for (int i = 20; i >= 1; i -= 2) {
            System.out.println("El número es: " + i);
        }

    }
}
