import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        // Fill the middle row and the middle column with "* " without quotes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.abs(i - j);
            }
        }

        for (int[] numbers : matrix) {
            for (int vector : numbers) {
                System.out.print(vector + " ");
            }
            System.out.println();
        }
    }
}