public class SpiralMatrix {
    public static void main(String[] args) {
        //Initialize 2D Array
        int[][] num ={
                {8,4,3,2},
                {5,87,3,7},
                {3,-1,6,4},
                {3,6,7,4}
        };
        spiralMatrix(num);

    }
    //Method for Doing Spiral Matrix
    public static void spiralMatrix(int[][]arr){
        int top = 0;
        int right = arr[0].length -1;
        int bottom = arr.length -1;
        int left = 0;


        while(left<=right && top<=bottom) {
            //Top row(left to right traversal)
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;
            //Right Column(Top to Bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            //Bottom Row(Right to Left)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
            }
            ;

            bottom--;
            //Left Column(Bottom to Top)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;

            }
        }
    }
}
