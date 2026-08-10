import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Original Array: ");
        //initialize the array
        int[] num = {89,5,-1,0,22,-76};
        displayArray(num);

        System.out.print("Enter the Num you want to Find in array: ");
        int target = sc.nextInt();

        findTarget(num, target);
    }
    //method to find the target value in array
    public static void findTarget(int[] arr, int target){
        boolean found = false;
        for(int i =0; i<arr.length; i++){
            if(target == arr[i]){
                System.out.println("Target Found at index " + i);
                found = true;
                break;
            }
        }
        //found = false means target not found (using flag variable in java)
        if(!found){
            System.out.println("Target not found in the array");
        }

    }
    //method to display array
    public static void displayArray(int[] arr){
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
