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

        //* Print the modified matrix

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
