package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void main(String[] args) {
        var nameFIle = "miFIle.txt";
        var file = new File(nameFIle);

        try {
            if (file.exists()) {
                System.out.println("Thie file exists.");
            }
            else {
                //* Create the file
                var output = new PrintWriter(new FileWriter(file));
                output.close();
                System.out.println("The file has been created.");
            }
        } catch (IOException e) {
            System.err.println("Error creating the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
