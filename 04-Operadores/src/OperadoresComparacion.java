public class OperadoresComparacion {
    public static void main(String[] args) {
        //* Operadores Comparacion
        System.out.println("Operadores Comparacion");
        int num1 = 10, num2 = 20;
        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);

        //? IGUALDAD
        boolean igualdad = num1 == num2;
        System.out.println("Resultado IGUALDAD == " + igualdad);

        //? DIFERENTE
        boolean diferente = num1!= num2;
        System.out.println("Resultado DIFERENTE != " + diferente);

        //? MAYOR QUE
        boolean mayorQue = num1 > num2;
        System.out.println("Resultado MAYOR QUE num1 > num2 " + mayorQue);

        //? MENOR QUE
        boolean menorQue = num1 < num2;
        System.out.println("Resultado MENOR QUE num1 < num2 " + menorQue);

        //? MAYOR IGUAL QUE
        boolean mayorIgual = num1 >= num2;
        System.out.println("Resultado MAYOR IGUAL QUE num1 >= num2 " + mayorIgual);

        //? MENOR IGUAL QUE
        boolean menorIgualque = num1 <= num2;
        System.out.println("Resultado MENOR IGUAL QUE num1 <= num2" + menorIgualque);
    }
}
