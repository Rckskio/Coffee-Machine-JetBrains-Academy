import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        boolean order = false;

        for (int i = 0; i < text.length - 1; i++) {
            if (text[i].compareTo(text[i + 1]) <= 0) {
                order = true;
            } else {
                order = false;
            }
        }

        System.out.println(order);
    }
}