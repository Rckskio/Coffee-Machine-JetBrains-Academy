import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[][] matrix = new String[number][number];
        /*
        // Fill each row with ". " without quotes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ". ";
            }
        }
        */
        // My solution
        // Fill each row with ". " without quotes
        for (String[] row: matrix) {
            Arrays.fill(row, ". ");
        }

        int middleRow = number / 2;
        int middleColumn = number / 2;
        int count = matrix.length - 1;

        // Fill the middle row and the middle column with "* " without quotes
        for (int i = 0; i < matrix.length; i++, count--) {
            matrix[i][i] = "* ";
            matrix[middleRow][i] = "* ";
            matrix[i][middleColumn] = "* ";
            matrix[i][count] = "* ";
        }

        // this code prints all 2-dimensional arrays
        for (String[] text : matrix) {
            for (String vector : text) {
                System.out.print(vector);
            }
            System.out.println();
        }

        //Better solution
        /*
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = '*';
            matrix[i][matrix.length - 1 - i] = '*';
            matrix[i][matrix.length / 2] = '*';
            matrix[matrix.length / 2][i] = '*';
        }

        for (String[] text : matrix) {
            for (String vector : text) {
                System.out.print(vector);
            }
            System.out.println();
        }
         */
    }
}