package Methods;

public class Main {
    static int sum(int a, int b) {
        return a + b;
    }

    static String concat(String text1, String text2){
        return text1 + " " + text2;
    }

    public static void main(String[] args) {
        System.out.println(sum(8, 8));

        String fullName = concat("Antuan", "Narvaez");
        System.out.println(fullName);

        // another way to do the above example
//        System.out.println(concat("Antuan", "Narvaez"));
    }
}
