public class MaxElement {
    public static void main(String[] args) {
        //Initialize Array
        int[] numbers = {3,89,76,44,22,98};
        //creating helper variable
        int max = numbers[0];

        //Traversing through whole array to find the max element
        for(int i = 1; i< numbers.length; i++){
            //Condition for updating max helper variable
            if(numbers[i]>max){
                max = numbers[i];
            }
        }

        System.out.println("Largest Number in the array is " + max);


    }
}
