public class ArrayMultidimensional {
    public static void main(String[] args) {
        // a multidimensional array is basically an array of arrays

        int[][] myNumbers = {
                {1, 2, 3, 4}, // 0
                {5, 6, 7, 8}, // 1
                {9, 10, 11, 12} // 2
        };

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
            System.out.println("Finish ------" + i);
        }
    }
}
