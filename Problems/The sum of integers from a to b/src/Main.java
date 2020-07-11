import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int sum = 0;

        for (int i = numA; i <= numB; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}