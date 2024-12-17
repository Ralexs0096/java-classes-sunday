public class ArrayClass {
    public static void main(String[] args) {
        // group - Array
        String[] cars = {
                "Volvo", // 0
                "BMW", // 1
                "Toyota", // 2
                "Kia",
                "Tesla",
                "Mazda",
                "Mercedes",
                "Supra",
                "McLaren" // 8
        };

        System.out.println(cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
