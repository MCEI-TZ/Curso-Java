import java.util.Set;
import java.util.TreeSet;
//* Section Collections
public class Sets {
    public static void main(String[] args) {
        //* Interface Set
        Set<String> content = new TreeSet<>(); //* Set Interface don't admit repeated elements
        content.add("Pedro");
        content.add("Pedro");
        content.add("Peter");
        content.add("John");
        content.add("Maria");

        content.forEach(System.out::println);

        content.remove("John");
        System.out.println("Content after removing John:");
        content.forEach(System.out::println);
    }
}
