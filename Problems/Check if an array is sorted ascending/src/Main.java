import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        boolean ascending = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] <= numbers[i + 1]) {
                ascending = true;
            } else {
                ascending = false;
                break;
            }
        }
        System.out.println(ascending);
    }
}