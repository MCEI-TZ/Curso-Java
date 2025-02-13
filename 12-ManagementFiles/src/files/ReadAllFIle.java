package files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllFIle {
    public static void main(String[] args) {
        var fileName = "miFIle.txt";
        try{
            //* Read all
            List<String> lines = Files.readAllLines(Paths.get(fileName));

            lines.forEach(System.out::println);
        }
        catch (Exception e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
