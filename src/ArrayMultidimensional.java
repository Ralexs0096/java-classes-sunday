public class ArrayMultidimensional {
    public static void main(String[] args) {
        // a multidimensional array is basically an array of arrays

        int[][] myNumbers = {
                {1, 2, 3, 4}, // 0
                {5, 6, 7, 8}, // 1
                {9, 10, 11, 12} // 2
        };

        for (int[] row : myNumbers) {
            for (int num : row){
                System.out.println(num);
            }
            System.out.println("--------");
        }
    }
}
