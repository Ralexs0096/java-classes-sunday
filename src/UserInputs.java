import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hey bud! what is your name?");
        String name = keyboard.nextLine();

        System.out.println("Nice to meet you " + name);
        System.out.println("How old are you " + name + "?");
        int age = keyboard.nextInt();

        if(age > 18) {
            System.out.println("You are older than I thought");
        } else {
            System.out.println("You are a baby");
        }
    }
}
