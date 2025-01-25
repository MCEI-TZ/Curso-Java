public class ConcatetacionCadenas {
    public static void main(String[] args) {
        //* Concatenación de cadenas

        //? Método +
        String nombre = "Hola";
        String apellido = "Mundo";

        String nombreCompleto = nombre + " " + apellido;

        System.out.println("nombreCompleto = " + nombreCompleto);

        //? Método concat
        String nombreCompleto2 = nombre.concat(" ").concat(apellido);

        //? String Builder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(nombre);
        constructorCadenas.append(" ");
        constructorCadenas.append(apellido);
        
        var resultaodo = constructorCadenas.toString();
        System.out.println("resultaodo = " + resultaodo);

        //? String Buffer
        var constructorBuffer = new StringBuffer();
        constructorBuffer.append(nombre).append(" ").append("Pedro");
        resultaodo = constructorBuffer.toString();
        System.out.println("constructorBuffer = " + constructorBuffer);

        //? join
        var productojoin = String.join("",nombre,apellido);
        System.out.println("productojoin = " + productojoin);
    }
}
