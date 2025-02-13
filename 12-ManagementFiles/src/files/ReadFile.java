package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        //* Read file
        var fileName = "miFIle.txt";
        var file = new File(fileName);

        try {
            if (!file.exists()) {
                System.out.println("The file does not exist.");
            }
            else {
                var input = new BufferedReader(new FileReader(file));
                String line;
                while ((line = input.readLine()) != null) {
                    System.out.println(line);
                }
                input.close();
            }
        }
        catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
