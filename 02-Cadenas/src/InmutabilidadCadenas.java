public class InmutabilidadCadenas {
    public static void main(String[] args) {
        //* Inmutabilidad de cadenas

        String nombre = "HOla";
        System.out.println("nombre = " + nombre);

        String nombre2 = nombre ;

        System.out.println("nombre = " + nombre2);

        nombre = "Adios";

        nombre2 = nombre;

        System.out.println("nombre2 = " + nombre2);
    }
}
