public class SumOfArray {

    public static void main(String[] args) {

        //initialize the array
        int[] numbers = {2,90,70,65,1,89};
        //creating helper variable
        int total = 0;

        //Traverse through the array
        for(int i = 0; i< numbers.length; i++){
            total = total + numbers[i];
        }
        System.out.println("Sum of this array is " + total);



    }
}
