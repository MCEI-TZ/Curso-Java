public class Cadenas {
    public static void main(String[] args) {
        //* Cadenas
        String nombre = "HOla";
        System.out.println("nombre = " + nombre);

        String nombre2 = new String("Mundo");
        System.out.println("nombre2 = " + nombre2);

        String nombre3 = nombre + " "+ nombre2;
        System.out.println("nombre3 = " + nombre3);

        String nombre4 = """
                Es es un texto
                multilinea
                """;
        System.out.println("nombre4 = " + nombre4);
    }
}
