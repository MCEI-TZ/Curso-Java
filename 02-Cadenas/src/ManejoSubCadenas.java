public class ManejoSubCadenas {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";

        System.out.println("cadena = " + cadena);

        System.out.println(cadena.length());

        System.out.println("Palabra 1 " + cadena.substring(0, 5));

        System.out.println("Palabra 2 " + cadena.substring(5, 10));

        //* Busqueda de Subcadenas

        var indice1 = cadena.indexOf("Hola");
        System.out.println("Indice de la palabra Hola: " + indice1);

        var indice2 = cadena.lastIndexOf("Mundo");
        System.out.println("Ultimo indice de la palabra Mundo: " + indice2);

        //*Remplazar subcadenas
        var nombre = "Hola Pedro";
        System.out.println("cadena original = " + nombre);
        var nuevaCadena = nombre.replace("Pedro","Juan");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
