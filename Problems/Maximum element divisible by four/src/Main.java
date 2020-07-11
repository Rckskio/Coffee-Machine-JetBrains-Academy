import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int maximum = 0;

        for (int i = 1; i <= elements; i++) {
            int j = scanner.nextInt();
            maximum = j % 4 == 0 ? j > maximum ? j : maximum : maximum;
        }

        System.out.println(maximum);
    }
}