package conditionals;

public class SwitchStatement {
    public static void main(String[] args) {
        // Switch Case structure:

//       switch (expression) {
//           case 1:
//               // code block
//               break;
//           case 2:
//               // code block
//               break;
//       }

        int day = 23; // this week day is absolutely wrong

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This option is not a valid one");
        }

        System.out.println("Test");
    }
}
