public class CicloDoWhile {
    public static void main(String[] args) {
        //* Ciclo do while

        int num = 11;
        //? El ciclo do while por lo menos hace la accion una vez aunque sea falso la condicion
        do {
            System.out.println("El número es: " + num);
            num++;
        } while (num <= 10);
    }
}
