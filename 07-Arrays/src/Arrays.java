public class Arrays {
    public static void main(String[] args) {

        //* Declare and initialize an array of integers
        int[] numbers;

        //* Assign values to the array elements
        numbers = new int[3];

        //* Accessing and modifying array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        //* Reading one by one element
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);

        //* Reading of all the arryas in a variable
        System.out.println("Original array elements:");
        for (int number : numbers) {
            System.out.println("-----Arrays of numbers-------");
            System.out.print(number + " ");
        }

    }
}
