import java.util.ArrayList;
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

        for (String list : myList){
            System.out.println("Day of the week: "+ list); //prints each element individually
        }
    }
}
