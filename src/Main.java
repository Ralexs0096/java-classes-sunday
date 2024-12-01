
class Main {
    public static void main(String[] args) {
        int time = 10;
//
//        if(time < 18){
//            System.out.println("Good day");
//        } else {
//            System.out.println("Good evening.");
//        }

        // shorthand (Ternary Operator)

        // variable = (condition) ? expressionTrue : expressionFalse

        String message = (time > 12) ? "Good Afternoon" : "Good morning";

        System.out.println(message);
    }
}