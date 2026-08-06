public class Sum2DArrayColumn {
    public static void main(String[] args) {

        //Initialize the 2D array
        int[][] num = {
                {1,4,6,7},
                {6,9,3,2},
                {8,5,2,1},
                {9,4,2,0}
        };

        ColumnSum(num);


    }

    //Method for displaying 2D array
    public static void displayArray(int[][]arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Method for summing the 2D array
    public static void ColumnSum(int[][]arr){
        //iterating through columns first to fix the column
        for(int j = 0; j<arr[0].length; j++){
            int total = 0;
            //inner loop for row here row changes
            for(int i = 0; i <arr.length; i++){
                total += arr[i][j];
            }
            System.out.println("The Sum of Column "+ j +" is " + total);
        }
    }
}
