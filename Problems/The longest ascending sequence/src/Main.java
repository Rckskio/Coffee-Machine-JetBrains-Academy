import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int count = 1;
        int maxCount = 1;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] >= numbers[i]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }
        }

        System.out.println(maxCount);
    }
}