import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numberM = scanner.nextLong();
        int numberN = 1;
        long factorial = 1;

        while (factorial <= numberM) {
            numberN++;
            factorial *= numberN;
        }

        System.out.println(numberN);
    }
}