import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum1 = num1 + num2;
        int sum2 = num1 + num3;
        int sum3 = num2 + num3;

        System.out.println(sum1 == 20 | sum2 == 20 | sum3 == 20);

    }
}