//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //System.out.println("First name: ");
        String name = scanner.next();
        //System.out.println("Age: ");
        int age = scanner.nextInt();
        //System.out.println("Stage of education: ");
        String stageOfEducation = scanner.next();
        //System.out.println("Years of Experience: ");
        int yearsOfExperience = scanner.nextInt();
        //System.out.println("Cuisine preference: ");
        String cuisinePreference = scanner.next();

        String data = age + stageOfEducation + yearsOfExperience;
        data.trim();

        System.out.printf("The form for %s is completed. We will contact " +
                "you if we need a chef that cooks %s dishes.\n", name, cuisinePreference);
    }
}