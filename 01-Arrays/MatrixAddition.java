public class MatrixAddition {
    public static void main(String[] args) {
        //Initialize 1st 2D Array
        int[][] num = {
                {8,4,2,1},
                {9,3,-2,5},
                {9,2,4,1}
        };
        //Initialize 2nd 2D Array
        int[][] num1 ={
                {9,4,3,2},
                {9,-22,23,4},
                {3,2,6,0}
        };

        display2D(num);
        //Improving Readability of Code
        System.out.println("------------------");
        display2D(num1);
        System.out.println("Addition of the Matrix: ");
        display2D(matrixAdditon(num, num1));



    }
    //Method for adding Matrix
    public static int[][] matrixAdditon(int[][] arr, int[][]arr1){
        int[][] sum = new int[arr.length][arr[0].length];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                sum[i][j] = arr[i][j] + arr1[i][j];

            }
        }
        return sum;
    }

    //display 2D Array
     public static void display2D(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
     }
}
