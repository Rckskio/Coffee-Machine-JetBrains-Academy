import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int count = 1;

        //
        while (bottom >= top && right >= left) {
            for (int j = left; j <= right; j++, count++) {
                matrix[top][j] = count;
            }

            // Since we have traversed the whole first
            // row, move down to the next row.
            top++;

            for (int i = top; i <= bottom; i++, count++) {
                matrix[i][right] = count;
            }

            // Since we have traversed the whole last
            // column, move down to the previous column.
            right--;

            for (int j = right; j >= left; j--, count++) {
                matrix[bottom][j] = count;
            }

            //  Since we have traversed the whole last
            //  row, move down to the previous row.
            bottom--;

            for (int i = bottom; i >= top; i--, count++) {
                matrix[i][left] = count;
            }

            //  Since we have traversed the whole first
            //  column, move down to the next column.
            left++;
        }

        // Print the array
        for (int[] num : matrix) {
            for (int print : num) {
                System.out.print(print + " ");
            }
            System.out.println();
        }
    }
}