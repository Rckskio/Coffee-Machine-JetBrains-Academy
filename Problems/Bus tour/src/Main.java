import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numOfBridges = scanner.nextInt();
        int whichBridge = 0;

        for (int i = 1; i <= numOfBridges; i++) {
            int heightOfBridges = scanner.nextInt();
            if (busHeight >= heightOfBridges && whichBridge == 0) {
                whichBridge = i;
            }
        }
        if (whichBridge != 0) {
            System.out.printf("Will crash on bridge %d", whichBridge);
        } else {
            System.out.println("Will not crash");
        }
    }
}