import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numN = scanner.nextInt();
        int count = 0;

        for (int i = numA; i <= numB; i++) {
            count += i % numN == 0 ? 1 : 0;
        }

        System.out.println(count);
    }
}