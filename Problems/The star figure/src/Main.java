import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String matrix[][] = new String[number][number];
        String current = ". ";

        /*
        // Fill each row with ". " without quotes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ". ";
            }
        }
        */

        // Fill each row with ". "
        for (String[] row: matrix) {
            Arrays.fill(row, ". ");
        }



        // this code prints all 2-dimensional arrays
        for (String[] text : matrix) {
            for (String vector : text) {
                System.out.print(vector);
            }
            System.out.println();
        }
    }
}