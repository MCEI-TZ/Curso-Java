package exceptions;

public class TestAritmeticException {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetics.division(10,0);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Division by zero"+ e.getMessage());
        }
        finally {
            System.out.println("We check the result");
        }
    }
}
