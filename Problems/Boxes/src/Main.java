import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];

        for (int i = 0; i < box1.length; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < box2.length; i++) {
            box2[i] = scanner.nextInt();
        }

        Arrays.sort(box1);
        Arrays.sort(box2);
        boolean equals = Arrays.equals(box1, box2);

        int maxBox1 = box1[2];
        int maxBox2 = box2[2];
        int minBox1 = box1[0];
        int minBox2 = box2[0];

        if (equals) {
            System.out.println("Box 1 = Box 2");
        } else {
            if (maxBox1 >= maxBox2 && minBox1 >= minBox2) {
                System.out.println("Box 1 > Box 2");
            } else if (maxBox2 >= maxBox1 && minBox2 >= minBox1) {
                System.out.println("Box 1 < Box 2");
            } else {
                System.out.println("Incomparable");
            }
        }

        /* -- Another way to solve
        int middleBox1 = box1[1];
        int middleBox2 = box2[1];
        if (minBox1 == minBox2 && middleBox1 == middleBox2 && maxBox1 == maxBox2) {
            System.out.println("Box 1 = Box 2");
        } else if (minBox1 >= minBox2 && middleBox1 >= middleBox2 && maxBox1 >= maxBox2) {
            System.out.println("Box 1 > Box 2");
        } else if (minBox1 <= minBox2 && middleBox1 <= middleBox2 && maxBox1 <= maxBox2) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable");
        }
         */
    }
}