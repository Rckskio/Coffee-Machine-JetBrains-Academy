import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        double average = 0;
        int count = 0;

        for (int i = numA; i <= numB; i++) {
            if (i % 3 == 0) {
                average += i;
                count++;
            }
        }
        System.out.println(average / count);
    }
}