import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beforeNum = scanner.nextInt();
        int num = scanner.nextInt();
        int count = 0;
        boolean ordered = false;

        if (num == 0) {
            ordered = true;
        }

        if (beforeNum <= num) {
            while (num != 0) {
                if (beforeNum <= num && count == 0) {
                    ordered = true;
                } else {
                    ordered = false;
                    count++;
                    if (beforeNum == 0) {
                        break;
                    }
                }
                beforeNum = num;
                num = scanner.nextInt();
            }
        }
        if (beforeNum >= num) {
            while (num != 0) {
                if (beforeNum >= num && count == 0) {
                    ordered = true;
                } else {
                    ordered = false;
                    count++;
                    if (beforeNum == 0) {
                        break;
                    }
                }
                beforeNum = num;
                num = scanner.nextInt();
            }
        }
        System.out.print(ordered);
    }
}