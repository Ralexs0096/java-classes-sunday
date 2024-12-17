public class ArrayMultidimensional {
    public static void main(String[] args) {
        // a multidimensional array is basically an array of arrays

        int[][] myNumbers = {
                {1,2,3,4}, // 0
                {5,6,7,8} // 1
        };

        System.out.println(myNumbers); // memory space

        myNumbers[1][2] = 22;
        System.out.println(myNumbers[1][2]);
    }
}
