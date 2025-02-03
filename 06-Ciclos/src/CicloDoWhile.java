public class CicloDoWhile {
    public static void main(String[] args) {
        //* Ciclo do while

        int num = 11;
        //? El ciclo do while por lo menos hace la accion una vez aunque sea falso la condicion
        do {
            System.out.println("El número es: " + num);
            num++;
        } while (num <= 10);

        //* EJEMPLO CICLO DO WHILE numeracion descendente de 10 a 1

        System.out.println("----------------------------------------------------------------");
        int contador = 10;
        do {
            System.out.println("El número es: " + contador);
            contador--;
        } while (contador >= 1);

        //* Numeros impares

        System.out.println("----------------------------------------------------------------");

        int numero = 0;
        do {
            if (numero % 2 != 0) { //* Condicion para impar
             System.out.println("El número impar es: " + numero);
            }
            numero++;
        } while (numero <= 20);
    }
}
