package Loops;

public class ForEach {
    public static void main(String[] args) {
        String[] cars = {
                "Volvo",
                "BMW",
                "Toyota",
                "Kia",
                "Tesla",
                "Mazda",
                "Mercedes",
                "Supra",
                "McLaren"
        };

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
