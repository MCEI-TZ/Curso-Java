public class TipoDatos {
    public static void main(String[] args) {
        // Valores Maximos y minimos de cada uno
        //*Byte
        System.out.println("Minimo valor Byte = " + Byte.MIN_VALUE);
        System.out.println("Máximo valor Byte = " + Byte.MAX_VALUE);

        //*Short
        System.out.println("Minimo valor short = " + Short.MIN_VALUE );
        System.out.println("Máximo valor short = " + Short.MAX_VALUE );

        //*Integer
        System.out.println("Minimo valor integer = " + Integer.MIN_VALUE);
        System.out.println("Máximo valor integer = " + Integer.MAX_VALUE);

        //*Long
        //! NOta: al mommento de declarar una variable con un valor long se tiene que poner una L para declarar que es long [[variable = 3.1432423L]]
        System.out.println("Minimo valor Long = " + Long.MIN_VALUE);
        System.out.println("Máximo valor Long = " + Long.MAX_VALUE);

        //*Float
        System.out.println("Minimo valor Float = " + Float.MIN_VALUE);
        System.out.println("Máximo valor Float = " + Float.MAX_VALUE);

        //*Double
        //! NOta: al mommento de declarar una variable con un valor long se tiene que poner una L para declarar que es long [[variable = 3.1432423L]]
        System.out.println("Minimo valor Double = " + Double.MIN_VALUE);
        System.out.println("Máximo valor Double = " + Double.MAX_VALUE);

        //*Character
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        char tipoCharDecial = 65;
        System.out.println("tipoCharDecial = " + tipoCharDecial);
        char tipoUnicode = '\u00A0';
        System.out.println("tipoUnicode = " + tipoUnicode);

        //* Boolean
        boolean tipoBoolean = false;
        System.out.println("Boolean false = " + tipoBoolean);
        tipoBoolean = true;
        System.out.println("Boolean true = " + tipoBoolean);

        //* Tipo Object
        String nombre = null;
        System.out.println("nombre = " + nombre);
    }
}
