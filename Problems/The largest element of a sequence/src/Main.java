import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int largestNumber = 0;
        int number = 0;
        do {
            number = scanner.nextInt();
            largestNumber = number > largestNumber ? number : largestNumber;
        } while (number != 0);

        System.out.println(largestNumber);
    }
}