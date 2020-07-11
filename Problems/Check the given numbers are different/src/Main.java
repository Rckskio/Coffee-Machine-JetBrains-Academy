import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean different1 = num1 != num2;
        boolean different2 = num1 != num3;
        boolean different3 = num2 != num3;

        System.out.println(different1 && different2 && different3);
    }
}