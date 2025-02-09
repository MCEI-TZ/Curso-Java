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

        System.out.println("Original array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
