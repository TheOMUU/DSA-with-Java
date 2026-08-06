import java.util.Scanner;

public class SumOf2DArrayRows {
    public static void main(String[] args) {

        //Taking Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter Cols: ");
        int col = sc.nextInt();

        //Initializing the 2D Array
        int num [][] = new int[row][col];

        System.out.println("Enter your 2D Array: ");
        for(row = 0; row<num.length; row++){
            for(col = 0; col<num[row].length; col++){
                num[row][col] = sc.nextInt();
            }
        }
        display2DArray(num);
        sum2DArray(num);
    }
    //Method for Displaying the 2D array
    public static void display2DArray(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Method for 2D array sum (ROWS)
    public static void sum2DArray(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            int total = 0;
            for(int j =0; j<arr.length; j++){
                total += arr[i][j];

            }
            System.out.println("Sum of row " + i + " is " + total);
        }
    }
}