import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int c = matrix[i][a];
            matrix[i][a] = matrix[i][b];
            matrix[i][b] = c;
        }
        // First time resolution - excess loop for!
        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int c = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b] = c;
                break;
            }
        }
         */
        for (int[] num : matrix) {
            for (int print : num) {
                System.out.print(print + " ");
            }
            System.out.println();
        }
    }
}