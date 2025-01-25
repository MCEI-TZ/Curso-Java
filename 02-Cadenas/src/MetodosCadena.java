public class MetodosCadena {
    public static void main(String[] args) {
        //* Metodos de cadenas

        String cadena = "Hola Mundo";

        System.out.println("Longitud de la cadena: " + cadena.length());

        System.out.println("Contenido de la cadena: " + cadena);

        System.out.println("mayúscula: " + cadena.toUpperCase());

        System.out.println("minúscula: " + cadena.toLowerCase());

        System.out.println("Reemplazar la primera letra de la cadena: " + cadena.replaceFirst("H", "A"));

        System.out.println("Reemplazar todas las letras 'o' de la cadena: " + cadena.replaceAll("o", "0"));

        System.out.println("Reemplazar todas las o por x: " + cadena.replace("o","x"));

        String cadena2 = " Hola Mundo ";

        System.out.println("Quitar los espacios del inicio y al final |"+ cadena2.trim());
    }
}
