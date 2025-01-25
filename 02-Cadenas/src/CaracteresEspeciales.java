public class CaracteresEspeciales {
    public static void main(String[] args) {
        //* Caracteres especiales

        String cadena = "Hola, Mundo!";

        System.out.println("Cadena original: " + cadena);

        System.out.println("\t"+cadena);

        System.out.println(cadena + "\n" + "Juan");
        
        System.out.println("Cadena con comillas dobles: " + "\"" + cadena + "\"");

        System.out.println("Cadena con comillas simple: " + "\'" + cadena + "\'");
    }
}
