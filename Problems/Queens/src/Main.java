import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        float changeY = y2 - y1;
        float changeX = x2 - x1;
        float slope = Math.abs(changeY) / Math.abs(changeX);

        if (y1 == x2 || x1 == y2 || slope == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        /* Another solution
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if (num1 == num3) {
            System.out.println("YES");
        } else if (num2 == num4) {
            System.out.println("YES");
        } else if (Math.abs(num1 - num3) == Math.abs(num2 - num4)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
         */
    }
}