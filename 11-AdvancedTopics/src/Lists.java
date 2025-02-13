import java.util.ArrayList;
import java.util.List;
//* Section Collections
public class Lists {
    public static void main(String[] args) {
        //* Interface List
        List myList = new ArrayList();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");
        myList.add("Monday"); //* In the interface List you can have values repeated

        for (Object list : myList){
            System.out.println("Day of the week: "+ list); //prints each element individually
        }
    }
}
