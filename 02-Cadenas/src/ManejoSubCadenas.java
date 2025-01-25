public class ManejoSubCadenas {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";

        System.out.println("cadena = " + cadena);

        System.out.println(cadena.length());

        System.out.println("Palabra 1 " + cadena.substring(0, 5));

        System.out.println("Palabra 2 " + cadena.substring(5, 10));
    }
}
