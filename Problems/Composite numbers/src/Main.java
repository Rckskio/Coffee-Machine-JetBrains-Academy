import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        boolean composite = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                composite = true;
            }
        }
        return composite;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}