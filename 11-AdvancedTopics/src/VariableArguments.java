public class VariableArguments {
    public static void main(String[] args) {
        printNumbers(1,2,3,4,5); //vargs
        multripleArgs("Pedro",2,3,4,5); //vargs
    }

    static void multripleArgs(String name, int... numbers) {
        System.out.println("Name: " + name);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); //prints each number individually

        }
    }

    static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); //prints each number individually
            
        }

    }
}
