public class OperadoresAsignacion {
    public static void main(String[] args) {
        //* Operadores Asignacion
        System.out.println("Operadores Asignacion");
        int num1 = 10, num2 = 20;

        System.out.printf("num1= %d, num2= %d %n",num1,num2);

        //? ASIGNACION
        num1 = num2;
        System.out.println("Resultado ASIGNACION num1 = num2 = " + num1);

        //? ASIGNACION CON SUMA
        num1 = 10;
        num2 = 20;
        System.out.printf("num1= %d, num2= %d %n",num1,num2);
        num1 += num2;
        System.out.println("Resultado ASIGNACION CON SUMA num1 += num2 = " + num1);

        //? ASIGNACION CON RESTA
        num1 = 10;
        num2 = 20;
        System.out.printf("num1= %d, num2= %d %n",num1,num2);
        num1 -= num2;
        System.out.println("Resultado ASIGNACION CON RESTA num1 -= num2 = " + num1);

        //? ASIGNACION CON MULTIPLICACION
        num1 = 10;
        num2 = 20;
        System.out.printf("num1= %d, num2= %d %n",num1,num2);
        num1 *= num2;
        System.out.println("Resultado ASIGNANACION CON MULTIPLICACION num1 *= num2: =" + num1);

        //? ASIGNACION CON DIVISION
        double num11 = 10.0;
        double num22 = 20.0;
        System.out.printf("num11= %.2f, num22= %.2f %n",num11,num22);
        num11 /= num22;
        System.out.println("Resultado ASIGNACION CON DIVISION num11 /= num22 = " + num11);

        //? ASIGNACION CON MODULO
        num1 = 40;
        num2 = 20;
        System.out.printf("num1= %d, num2= %d %n",num1,num2);
        num1 %= num2;
        System.out.println("Resultado ASIGNACION CON MODULO num1 %= num2 = " + num1);
    }
}
