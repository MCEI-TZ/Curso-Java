import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//* Section Collections
public class Lists {
    public static void main(String[] args) {
        //* Interface List
        List<String> myList = new ArrayList<>(); //* Management of Generic
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");
        myList.add("Monday"); //* In the interface List you can have values repeated

        System.out.println("-------------Cycle For ----------------");
        for (String list : myList){
            System.out.println("Day of the week: "+ list); //prints each element individually
        }

        //* Lambda functions
        System.out.println("----------------Lambda Functions ----------------");
        myList.forEach(element -> {
            System.out.println("Day of the week: "+ element); //prints each element individually
        });

        //* Reference Functions
        System.out.println("----------------Reference Functions ----------------");
        myList.forEach(System.out::println);

        System.out.println("----------------------------------------------------");
        List<String> names = Arrays.asList("John", "Pedro", "Peter");
        names.forEach(System.out::println);
    }
}
