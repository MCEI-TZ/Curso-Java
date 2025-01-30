public class OperadoresUnarios {
    public static void main(String[] args) {
        //* Operadores Unarios
        System.out.println("Operadores Unarios");
        int num1 = 10;

        //? Positivo
        int positivo = +num1;
        System.out.println("Positivo de num2 = " + positivo); //No es necesario

        //? NEGATIVO
        int negativo = -num1;
        System.out.println("Negativo de num1 = " + negativo);

        //? NEGADO
        boolean negado = !true;
        System.out.println("Negado de true = " + negado);

        //? PREINCREMENTO
        int increment = ++num1;
        System.out.println("Preincremento de num1 = " + increment);

        //? PREDECREMENTO
        int decrement = --num1;
        System.out.println("Predecremento de num1 = " + decrement);
        
        //? POSTINCREMENTO
        int num2 = 7;
        var resultadopostIncrement = num2++;
        System.out.println("Postincremento de num2 antes del incremento= " + resultadopostIncrement);
        resultadopostIncrement = num2;
        System.out.println("Postincremento de num2 despues del incremento= " + resultadopostIncrement);

        //? POSTDECREMENTO
        int num3 = 8;
        var resultadopostDecrement = num3--;
        System.out.println("Postdecremento de num3 antes del decremento= " + resultadopostDecrement);
        resultadopostDecrement = num3;
        System.out.println("Postdecremento de num3 despues del decremento= " + resultadopostDecrement);
    }
}
