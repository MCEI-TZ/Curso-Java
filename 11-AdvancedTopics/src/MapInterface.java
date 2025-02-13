import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        //* Interface Map
        Map<String, String> person = new HashMap<>();
        person.put("name", "John");
        person.put("lastName", "Doe");
        person.put("age", "21");

        System.out.println("----Values of Map---");
        person.entrySet().forEach(System.out::println);

        //* Modified Map
        person.put("name", "Pedro"); //* Modified Map a existing key
        System.out.println("----Modified Values of Map---");
        person.entrySet().forEach(System.out::println);

        //* Removing Map
        person.remove("age"); //* Removing Map a key
        System.out.println("----Removed Values of Map---");
        person.entrySet().forEach(System.out::println);

        //* Iterate the keys and values separately
        System.out.println("--------------Iterate keys and values separately------------------");
        person.forEach((key, value) -> System.out.println("Key: "+key + " Value: "+value));

        //* Clearing Map
        person.clear(); //* Clearing Map
        System.out.println("----Cleared Values of Map---");
        person.entrySet().forEach(System.out::println);

    }
}
