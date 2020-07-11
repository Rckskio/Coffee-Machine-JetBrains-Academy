import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int rpbc = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean week = rpbc >= 10 && rpbc <= 20 && !weekend;
        System.out.println(week || weekend && rpbc >= 15 && rpbc <= 25);


    }
}