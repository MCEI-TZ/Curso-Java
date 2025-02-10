import java.util.Scanner;

public class Functions {
    //* Define a function
    static void HelloName(String name){
        System.out.println("Hello "+ name);
    }

    public static void main(String[] args) {
        //* Call the function
        var scanner = new Scanner(System.in);
        System.out.println("Insert your name: ");
        var name = scanner.nextLine();
        HelloName(name);
    }
}
