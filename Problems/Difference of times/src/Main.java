import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstHours = (scanner.nextInt() * 60) * 60;
        int firstMinutes = scanner.nextInt() * 60;
        int firstSeconds = scanner.nextInt();
        int firstTotalSeconds = firstHours + firstMinutes + firstSeconds;
        int secondHours = (scanner.nextInt() * 60) * 60;
        int secondMinutes = scanner.nextInt() * 60;
        int secondSeconds = scanner.nextInt();
        int secondTotalSeconds = secondHours + secondMinutes + secondSeconds;

        System.out.println(secondTotalSeconds - firstTotalSeconds);

    }
}