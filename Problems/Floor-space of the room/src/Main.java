import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfRoom = scanner.nextLine();
        double area = 0;
        double a;
        double b;
        double c;
        double pi = 3.14;
        double r;

        switch (typeOfRoom) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(area);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;
                System.out.println(area);
                break;
            case "circle":
                r = scanner.nextInt();
                area = pi * Math.pow(r, 2);
                System.out.println(area);
                break;
            default:
                break;
        }
    }
}