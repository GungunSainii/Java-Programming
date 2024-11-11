public class Max_Subarray_Sum {
    //Max subarray sum by BRUTE FORCE METHOD 
    public static void Max_Subarray_Sum(int array[]){
        int curr_Sum = 0;
        int Max_Sum = Integer.MIN_VALUE;
        for ( int i = 0 ; i < array.length - 1 ; i++){
            for ( int j = i  ; j < array.length ; j++){
                curr_Sum = 0;
                for ( int k = i ; k <= j ; k++){
                    
                    curr_Sum += array[k];
                }
                if (curr_Sum > Max_Sum){
                    Max_Sum = curr_Sum;
                }
                System.out.print(curr_Sum);
                System.out.println();
            }
            
        }
        System.out.println("Max Subarray Sum :" + Max_Sum); 
    }
    public static void main(String args[]){
        int array[] = {1,-2,6,-1,3};
        Max_Subarray_Sum(array);
    }    
}
