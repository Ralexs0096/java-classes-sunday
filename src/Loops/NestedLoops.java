package Loops;

public class NestedLoops {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("--- Inner: " + j); // executes 6 (2 x 3) times
            }
        }
    }
}
