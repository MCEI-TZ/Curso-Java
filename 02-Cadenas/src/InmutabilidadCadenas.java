public class InmutabilidadCadenas {
    public static void main(String[] args) {
        //* Inmutabilidad de cadenas

        String nombre = "HOla";
        System.out.println("nombre = " + nombre);

        nombre = nombre + " Mundo"; // Esto provoca una nueva cadena en memoria

        System.out.println("nombre = " + nombre);

        String nombre2 = nombre.concat("!"); // Esto también crea una nueva cadena en memoria

        System.out.println("nombre2 = " + nombre2);
    }
}
