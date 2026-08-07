public class MinElement2DArray {
    public static void main(String[] args) {
        //Initialize 2D Array
        int [][] num = {
                {3,7,8,9,},
                {7,11,22,-8},
                {0, -7, -6,-44}
        };

        display2D(num);
        minElement2D(num);

    }
    //Method for finding Minimum Element in 2D array
    public static void minElement2D(int[][] arr){
        int min = arr[0][0];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(min > arr[i][j]){
                    min = arr[i][j];
                }

            }
        }
        System.out.println("Min Element in 2D Array is " + min);
    }
    //Method for displaying 2D Array
    public static void display2D(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
