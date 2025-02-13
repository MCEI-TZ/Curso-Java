package files;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) {
        //* Write file
        var fileName = "miFIle.txt";
        var file = new File(fileName);
        boolean isAdd = file.exists();
        try {
            if (!file.exists()) {
                System.out.println("The file exits!");
            }
            var output = new PrintWriter(new FileWriter(file, isAdd));
            output.write("This is a new line.\n");
            output.write("This is another new line.\n");
            output.close();

            System.out.println("File written successfully.");
        }
        catch (Exception e){
            System.err.println("Error writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
