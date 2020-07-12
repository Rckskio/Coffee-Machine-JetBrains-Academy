import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int[][] rot = new int[m][n];
        int[][] array2 = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int a = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array2[i][j] = array[a][j];
            }
            a--;
        }

        for (int i = 0; i < rot.length; i++) {
            for (int j = 0; j < array.length; j++) {
                rot[i][j] = array2[j][i];
            }
        }

        for (int[] num : rot) {
            for (int print : num) {
                System.out.print(print + " ");
            }
            System.out.println();
        }
    }
}