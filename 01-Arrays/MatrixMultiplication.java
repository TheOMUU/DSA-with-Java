public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] num = {
                {3,6,7,8},
                {6,8,2,3}
        };
        int[][] num1 = {
                {8,2},
                {9,4},
                {9,3},
                {2,-1}
        };

        display2D(num);
        System.out.println("--------------");
        display2D(num1);
        System.out.println("--------------");
        System.out.println("Standard Multiplication of 2D Array: ");
        display2D(matrixMultiplication(num, num1));
    }

    //2D Array Standard Multiplication of Matrix
    public static int[][] matrixMultiplication(int[][]arr, int[][]arr1){
        int[][] result = new int[arr.length][arr1[0].length];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr1[0].length; j++){
                int total = 0;
                for(int k = 0; k<arr[0].length; k++){
                    total += arr[i][k] * arr1[k][j];
                }
                result[i][j] = total;
            }
        }
        return result;
    }

    //Displaying 2D array
    public static void display2D(int[][]arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
