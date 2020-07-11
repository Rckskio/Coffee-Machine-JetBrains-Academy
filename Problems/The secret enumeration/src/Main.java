public class Main {

    public static void main(String[] args) {
        Secret[] secret = Secret.values();
        int count = 0;

        for (Secret test : secret) {
            String name = test.name();
            if (name.startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);


    }
}

/*enum Secret {
    STAR, CRASH, START, // ...
}*/
