import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return n == 0 ? 1 : fac;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}