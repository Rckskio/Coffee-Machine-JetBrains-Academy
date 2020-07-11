import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean firstPositive = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean secondPositive = num2 > 0 && num1 <= 0 && num3 <= 0;
        boolean thirdPositive = num3 > 0 && num1 <= 0 && num2 <= 0;

        System.out.println(firstPositive || secondPositive || thirdPositive);
    }
}