public class ArrayClass {
    public static void main(String[] args) {
        int[] nums = { 2, 89, 98 };

        // group - Array
        String[] cars = {
                "Volvo", // 0
                "BMW", // 1
                "Toyota", // 2
        };

        cars[1] = "Tesla";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
    }
}
