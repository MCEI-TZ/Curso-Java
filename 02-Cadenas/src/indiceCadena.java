public class indiceCadena {
    public static void main(String[] args) {
        //! Manejo de Indices en cadenas

        String cadena1 = "1 Hola Mundo 0";

        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);
        
        var ultimoCaracter = cadena1.charAt(cadena1.length() -1 );

        System.out.println("ultimoCaracter = " + ultimoCaracter);
        
        var randomCaracter = cadena1.charAt(3);
        System.out.println("randomCaracter = " + randomCaracter);
    }
}
