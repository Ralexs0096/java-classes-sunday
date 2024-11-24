
class Main {
    public static void main(String[] args) {
       String calcType = "mod";

       int firstNumber = 12;
       int secondNumber = 8;

       if(calcType == "sum") {
           System.out.println(firstNumber + secondNumber);
       } else if (calcType == "div") {
           System.out.println(firstNumber / secondNumber);
       } else if (calcType == "sub") {
           System.out.println(firstNumber - secondNumber);
       } else if (calcType == "mul"){
           System.out.println(firstNumber * secondNumber);
       } else if (calcType == "mod") {
           System.out.println(firstNumber % secondNumber);
       } else {
           System.out.println("Operator not valid");
       }
    }
}