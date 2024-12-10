public class ArrayClass {
    public static void main(String[] args) {
        // group - Array
        String[] cars = {
                "Volvo", // 0
                "BMW", // 1
                "Toyota", // 2
        };

//        fails since the index is out of the bounds
//        System.out.println(cars[5]);

        for(int i = 0; i < 3; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("Hey!");
    }
}
