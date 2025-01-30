public class OperadoresLogicos {
    public static void main(String[] args) {
        //* Operadores Logicos
        System.out.println("Operadores Logicos");
        boolean var1 = false, var2 = false;

        System.out.printf("var1 = %b, var2 = %b %n", var1, var2);

        //? AND
        boolean and = var1 && var2;
        System.out.println("Resultado AND var1 && var2 = " + and);

        //? OR
        boolean or = var1 || var2;
        System.out.println("Resultado OR var1 || var2 = " + or);

        //? NOT
        boolean not =!var1;
        System.out.println("Resultado NOT! var1 = " + not);

        //? XOR (bits si son diferentes en memoeria)
        //var1 = false; //Son diferentes en memoria
        //var2 = true;
        boolean xor = var1 ^ var2;
        System.out.println("Resultado XOR var1 ^ var2 = " + xor);

    }
}
