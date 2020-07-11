import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char cha = Character.toLowerCase(ch);
        return cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u';
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}