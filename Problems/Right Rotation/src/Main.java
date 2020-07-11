import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        int numbersOfRotation = scanner.nextInt();
        String[] array;
        array = numbers.split(" ");

        numbersOfRotation %= array.length;

        for (int i = 0; i < numbersOfRotation; i++) {
            String last;
            last = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }

        for (String n : array) {
            System.out.print(n + " ");
        }

    }
}
