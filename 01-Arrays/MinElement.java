public class MinElement {
    public static void main(String[] args) {
        //Initialize the Array
        int[] num = {-25, -6, 0, 19, 78, 55};
        //Creating Helper Variable
        int min = num[0];
        //Traversing through array
        for(int i = 1; i< num.length; i++){
            //Condition for updating min value
            if(num[i]<min){
                min = num[i];
            }
        }
        System.out.println("Smallest Element of Array is " + min);
    }
}
