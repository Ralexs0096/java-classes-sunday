package Loops;

public class WhileLoop {
    public static void main(String[] args) {
    // structure

//    while(condition){
//        // code block to be executed
//    }

        /**
         * !!!!! Avoid do this type of evaluation
         * because it can create an infinite loop
         */

//        while(true) {
//            System.out.println("Hello infinitely");
//        }

        int i = 0;

        while (i < 5) {
            System.out.println("i value is: " + i);
            i++;
        }

        System.out.println("End");
    }
}
