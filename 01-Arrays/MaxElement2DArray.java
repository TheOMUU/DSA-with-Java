public class MaxElement2DArray {
    public static void main(String[] args) {
        //Initialize the Array
        int[][]num ={
                {2,6,8,9},
                {98,67,3,1},
                {2,5,8,1},
                {8,22,11,500}
        };

        display2DArray(num);
        maxElement2D(num);

    }
    //Method for Displaying 2D Array
    public static void display2DArray(int[][] arr){
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Method for Displaying Max Element Number
    public static void maxElement2D(int [][] arr){
        int max = arr[0][0];
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max Element of arr is " + max);
    }
}
