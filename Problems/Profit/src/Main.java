import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextInt();
        int percent = scanner.nextInt();
        double goal = scanner.nextInt();
        int years = 0;

        while (money < goal) {
            money += money * percent / 100;
            years++;
        }

        System.out.println(years);
    }
}