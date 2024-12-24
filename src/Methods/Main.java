package Methods;

public class Main {
    static void sayHello(String fname, int age) { // parameter
        // code to be executed
        System.out.println("Hello, " + fname + "!");
        System.out.println("You are " + age);
    }

    public static void main(String[] args) {
        sayHello("Antuan", 14); // argument
        sayHello("Alex", 28);
    }
}
