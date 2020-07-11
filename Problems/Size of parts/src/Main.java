import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOfParts = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 1; i <= numberOfParts; i++) {
            int detector = scanner.nextInt();
            if (detector == 0) {
                perfect++;
            }
            if (detector == -1) {
                smaller++;
            }
            if (detector == 1) {
                larger++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}