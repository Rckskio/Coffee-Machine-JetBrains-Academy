import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int num1 = 0;
        int num2 = 0;

        /*for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > num1) {
                num1 = numbers[i];
            } else if (numbers[i] > num2) {
                num2 = numbers[i];
            }
        }*/

        for (int num : numbers) {
            if (num > num1) {
                num1 = num;
            } else if (num > num2) {
                num2 = num;
            }
        }
        System.out.println(num1 * num2);
    }
}