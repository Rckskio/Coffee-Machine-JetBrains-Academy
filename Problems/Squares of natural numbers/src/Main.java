import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int square = 1;
        int count = 1;

        while (square <= number) {
            square = count * count;
            if (square <= number) {
                System.out.println(square);
            }
            count++;
        }
    }
}