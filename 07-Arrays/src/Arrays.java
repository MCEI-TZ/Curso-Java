import java.util.Scanner;

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
            System.out.print(number + " ");
        }

        //* Other way to define an array
        var array1 = new int[] {1,2,3,4,5,6,7,8};
        System.out.println("-----------------");
        for (int array: array1 ){
            System.out.print(array+ " ");
        }

        System.out.println("--------------");
        for (int i= 0; i < array1.length; i++){
            System.out.println("array: "+ array1[i]);
            i++;
        }

        //* Insert values into an array
        var scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to insert: ");
        int arraylength = Integer.parseInt(scanner.nextLine());
        var numbes = new int[arraylength];
        for (int i=0; i < numbes.length; i++) {
            System.out.println("Insert the value of  the array["+i+ "]");
            numbes[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Array with inserted elements:");
        for (int number : numbes) {
            System.out.print(number + " ");
        }

        //* Example scholar qualification
        System.out.println("Introduce the number of qualification do you want to save:");
        var qualification = Integer.parseInt(scanner.nextLine());
        var qualificationArray = new int[qualification];
        var plusQualification = 0;
        for (int i=0; i < qualification; i++){
            System.out.println("Introduce you calification ["+i+"]");
            qualificationArray[i] = Integer.parseInt(scanner.nextLine());
            plusQualification += qualificationArray[i];
        }
        System.out.println("Calification final "+ plusQualification/qualification);
    }
}
