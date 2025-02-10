public class RecursiveFunctions {
    //* Define a recursive function
    static void recursiveFunction(int number){
        if (number == 1){
            System.out.println("number = " + number);
        }else
            recursiveFunction(number-1);
        System.out.println("number = " + number);
    }
    public static void main(String[] args) {
        //* Call the function
        recursiveFunction(5);
    }
}
