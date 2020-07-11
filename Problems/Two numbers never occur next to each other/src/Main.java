import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean found = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == n && numbers[i + 1] == m) {
                found = false;
                break;
            }
            if (numbers[i] == m && numbers[i + 1] == n) {
                found = false;
                break;
            }
        }

        System.out.println(found);

    }
}