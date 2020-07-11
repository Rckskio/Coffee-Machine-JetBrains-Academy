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
        int containN = 50;
        int containM = 50;

        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]) {
                containN = i;
            }
            if (m == numbers[i]) {
                containM = i;
            }
        }
        int num = containN - containM;

        System.out.println(Math.abs(num) == 1 ? true : false);
    }
}