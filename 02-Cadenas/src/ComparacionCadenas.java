public class ComparacionCadenas {
    public static void main(String[] args) {
        //* Comparacion de cadenas

        String cadena1 = "Hola";
        String cadena2 = "Hola";

        System.out.println("cadena1 == cadena2: " + (cadena1 == cadena2)); //? Esto hace referencia a la memoria pero señalando al mismo objeto

        String cadena3 = new String("Hola");
        String cadena4 = new String("Hola");

        System.out.println("cadena3 == cadena4: " + (cadena3 == cadena4)); //? Esto hace referencia a la memoria con el mismo contenido pero diferente objeto

        System.out.println("cadena3.equals(cadena4): " + cadena3.equals(cadena4)); //? Esto hace referencia al contenido
    }
}
