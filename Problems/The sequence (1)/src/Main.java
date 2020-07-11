import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                count += 1;
                if (count > num) {
                    break;
                }
                System.out.print(i + " ");
            }
            if (count > num) {
                break;
            }
        }
    }
}