public class MatrixTranspose {
    public static void main(String[] args) {
        //Initialize the 2D Array
        int[][] num = {
                {8,3,1,7},
                {9,6,0,3},
        };

        display2D(num);
        //creating result array to store the value of transpose array
        int[][] result = matrixTranspose(num);
        display2D(result);


    }
    //Method for Matrix Transpose
    public static int [][] matrixTranspose(int[][] arr) {
        /* Array is row x column and Transpose is column x row
         * So we have to create a new 2D array matrix named as Transpose */
        int[][] transpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];

            }
        }
        //returning 2D transpose array to the Method
        return transpose;

    }
    //Displaying 2D Array
    public static void display2D(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}