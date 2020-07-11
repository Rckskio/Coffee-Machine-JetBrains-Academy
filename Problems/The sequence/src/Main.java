import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int count = 1;
        int maximum = 0;

        while (count <= elements) {
            int numbers = scanner.nextInt();
            maximum = numbers % 4 == 0 && numbers > maximum ? numbers : maximum;
            count++;
        }

        System.out.println(maximum);
    }
}