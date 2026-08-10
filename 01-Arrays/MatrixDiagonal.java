public class MatrixDiagonal {
    public static void main(String[] args) {
        //Initialize the 2D Array
        int[][] num = {
                {3,4,2,1},
                {6,3,7,8},
                {9,1,5,6},
                {8,3,2,1}
        };
        matrixFirstDiagonal(num);
        matrixSecondDiagonal(num);

    }
    //Method for Finding First Diagonal of Matrix
    public static void matrixFirstDiagonal(int[][] arr) {
        System.out.println("First Diagonal: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
    }
    //Method for Finding Second Diagonal of Matrix
    public static void matrixSecondDiagonal(int[][] arr){
        System.out.println("Second Diagonal: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i][arr.length-1-i] + " ");
            }
        System.out.println();

    }
}
