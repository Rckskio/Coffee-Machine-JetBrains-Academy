import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durationOfDays = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int oneWayFlight = scanner.nextInt();
        int costOneNightHotel = scanner.nextInt();

        int totalMoney = durationOfDays * foodPerDay + oneWayFlight * 2 + costOneNightHotel * (durationOfDays - 1);

        System.out.println(totalMoney);
    }
}