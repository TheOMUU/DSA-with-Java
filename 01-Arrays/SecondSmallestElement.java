public class SecondSmallestElement {
    public static void main(String[] args) {
        //Initialize the array
        int[] num = {8,4,2,5,44,33,2,-2};
        secondSmallest(num);
    }
    //Method for displaying Second Smallest Element in the array
    public static void secondSmallest(int[] arr){
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min){
                secondMin = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        System.out.println("Second Smallest Element in the array is " + secondMin);
    }
}
