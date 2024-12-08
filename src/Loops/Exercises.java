package Loops;

public class Exercises {
    public static void main(String[] args) {
        int countdown = 10;

        while (countdown > 0) {
            System.out.println(countdown);
            if(countdown == 5) {
                System.out.println("Play: Faltan 5 pa las doce...");
            }
            countdown--; // decrement operator
        }

        System.out.println("Happy new Year!!!");


    }
}
