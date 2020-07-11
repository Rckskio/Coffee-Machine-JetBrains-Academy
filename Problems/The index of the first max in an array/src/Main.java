import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int size = scanner.nextInt();
        final int[] numbers = new int[size];
        int max = 0;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }

        System.out.println(index);
    }
}