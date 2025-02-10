import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        //* Define a matrix
        var matrix = new int[2][3];
        //* Modify a matrix
            matrix[0][0] = 10;
            matrix[0][1] = 20;
            matrix[0][2] = 30;
            matrix[1][0] = 40;
            matrix[1][1] = 50;
            matrix[1][2] = 60;

        //* Print the matrix
        System.out.println("----Matrix--------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //* Other way to define a matrix
        var matrix2 = new int[][]{{10,20,30},{40,50,60}};

        //* Insert the values into the matrix array dinamic order

        var scanner = new Scanner(System.in);
        System.out.println("Provide the rows that you want for the matrix");
        var rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Provide the columns that you want for the matrix");
        var columns = Integer.parseInt(scanner.nextLine());

        var matrix3 = new int[rows][columns];

        for (int i= 0; i<rows; i++) {
            for (int j= 0; j<columns; j++){
                System.out.println("Insert the value of [" + i + "," + j + "]");
                matrix3[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i= 0; i<rows; i++) {
            for (int j= 0; j<columns; j++){
                System.out.println("Value of [" + i + "," + j + "] = "+matrix3[i][j]);
            }
        }
    }
}
