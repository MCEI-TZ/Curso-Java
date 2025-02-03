public class CicloWhile {
    //? Este código muestra un ciclo while que imprime los números del 1 al 10
    //! Nota se debe agregar una forma para que el ciclo termine y no se haga infinite
    //* Ciclo while
    //? El ciclo while comprueba primero la condicion sino cumple la condicion no funciona
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10) {
            System.out.println("El número es: " + num);
            num++;
        }

        //* EJEMPLO CICLO WHILE solo pares

        int contandor = 1;

        while (contandor <= 20) {
            if(contandor % 2 == 0) {
                System.out.println("El número " + contandor + " es par.");
            }
            contandor++;
        }
    }

}
