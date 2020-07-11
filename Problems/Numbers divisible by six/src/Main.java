import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < elements; i++) {
            int j = scanner.nextInt();
            sum += j % 6 == 0 ? j : 0;
        }

        System.out.println(sum);
    }
}