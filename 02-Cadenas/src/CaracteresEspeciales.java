public class CaracteresEspeciales {
    public static void main(String[] args) {
        //* Caracteres especiales

        String cadena = "Hola, Mundo!";

        System.out.println("Cadena original: " + cadena);

        System.out.println("\t"+cadena);

        System.out.println(cadena + "\n" + "Juan");
        
        System.out.println("Cadena con comillas dobles: " + "\"" + cadena + "\"");

        System.out.println("Cadena con comillas simple: " + "\'" + cadena + "\'");

        //* Ejemplo de un Generador de Email
        System.out.println("----------------------------------------------------------------");
        System.out.println("***+Generador de Emails***");
        System.out.println("\t Datos Generales");
        var nombre = "\'Juan Pablo Rodriguez Hernandez\'";
        System.out.println("nombre = " + nombre);
        var empresa = "Gloabl Mentoring";
        System.out.println("empresa = " + empresa);
        var dominio = ".com.mx";
        System.out.println("dominio = " + dominio);

        var email = nombre.toLowerCase().replace(" ",".") + "@" + empresa.toLowerCase().strip().replace(" ",".").concat(dominio);
        System.out.println("\n email = " + email);
    }
}
