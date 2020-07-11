import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int studentsGroup1 = scanner.nextInt();
        int studentsGroup2 = scanner.nextInt();
        int studentsGroup3 = scanner.nextInt();

        studentsGroup1 = studentsGroup1 / 2 + studentsGroup1 % 2;
        studentsGroup2 = studentsGroup2 / 2 + studentsGroup2 % 2;
        studentsGroup3 = studentsGroup3 / 2 + studentsGroup3 % 2;

        System.out.println(studentsGroup1 + studentsGroup2 + studentsGroup3);

    }
}