import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digits = 0;

        while (num != 0) {
            num = scanner.nextInt();
            digits++;
        }

        System.out.println(digits);
    }
}