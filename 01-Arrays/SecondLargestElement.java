public class SecondLargestElement {
    public static void main(String[] args) {

        //Initialize the Array
        int[] num ={5,4,3,2,1, 28, 27};
        secondLargest(num);

    }
    //Method for getting 2nd Largest Number from array
    public static void secondLargest(int[] arr){
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        System.out.println("Second Largest Number is: " + secondMax);

    }
}
