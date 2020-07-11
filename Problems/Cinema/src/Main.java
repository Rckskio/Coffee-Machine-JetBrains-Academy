import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();

        int[][] cinema = new int[rows][seats];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }
        int tickets = scanner.nextInt();
        int count = 1;

        boolean found = false;

        //
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats - 1; j++) {
                if (cinema[i][j] == 0 && cinema[i][j + 1] == 0) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == tickets) {
                    found = true;
                    System.out.println(i + 1);
                    break;
                }
            }
            count = 1;
            if (found) {
                break;
            }
        }
        //
        if (!found) {
            System.out.println(0);
        }
    }
}