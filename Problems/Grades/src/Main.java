import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int i = 1; i <= students; i++) {
            int grades = scanner.nextInt();
            if (grades == 2) {
                countD++;
            } else if (grades == 3) {
                countC++;
            } else if (grades == 4) {
                countB++;
            } else if (grades == 5) {
                countA++;
            }
        }

        System.out.println(countD + " " + countC + " " + countB + " " + countA);
    }
}