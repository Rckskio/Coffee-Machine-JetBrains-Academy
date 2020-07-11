import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfUnits = scanner.nextInt();

        if (numberOfUnits < 1) {
            System.out.println("no army");
        } else if (numberOfUnits >= 1 && numberOfUnits <= 19) {
            System.out.println("pack");
        } else if (numberOfUnits >= 20 && numberOfUnits <= 249) {
            System.out.println("throng");
        } else if (numberOfUnits >= 250 && numberOfUnits <= 999) {
            System.out.println("zounds");
        } else if (numberOfUnits >= 1000) {
            System.out.println("legion");
        }
    }
}