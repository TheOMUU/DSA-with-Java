public class ReverseArray {
    public static void main(String[] args) {
        //Initializing the Array
        int [] num ={67,33,-1,0,78,600};
        System.out.println("Original Array: ");
        displayArray(num);
        reverse(num);
        System.out.println("Reversed Array: ");
        displayArray(num);

    }

    //Method for reversing the Array(Two Pointer Method)
    public static void reverse(int[] arr){
        //Using two pointer method to reverse the array
        int left = 0;
        int right = arr.length - 1;//This will get the last index of array
        while(left<right){
            //swap the last index with first and so on
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    //Method for displaying Array
    public static void displayArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
