public class Exceptions {
    public static void main(String[] args) {
        int valor1 = 10, valo2 = 0;
        try {
            int resultado = valor1/valo2;
            System.out.println("Resultado: " + resultado);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
