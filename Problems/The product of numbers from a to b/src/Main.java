import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        long product = numA;

        for (int i = numA + 1; i < numB; i++) {
            product *= i;
        }

        System.out.println(product);

    }
}