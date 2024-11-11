public class Max_Subarray_Sum2 {
    //Max subarray sum by Prefix Sum Technique
    //Time complexicity - O(n^2) 
    public static void Max_Subarray_Sum(int array[]){
        int curr_Sum = 0;
        int Max_Sum = Integer.MIN_VALUE;
        int prefix_array[] = new int[array.length];

        //Calculate prefix array
        prefix_array[0] = array[0];
        for ( int i = 1 ; i < array.length ; i++){
            prefix_array[i] = prefix_array[i -1] + array[i]; 
        }

        for ( int i = 0 ; i < array.length ; i++){
            for ( int j = i  ; j < array.length ; j++){
                curr_Sum = i==0 ? prefix_array[j] : prefix_array[j] - prefix_array[i -1];
                if (curr_Sum > Max_Sum){
                    Max_Sum = curr_Sum;
                }
            }    
        }
        System.out.println("Max Subarray Sum :" + Max_Sum); 
    }
    public static void main(String args[]){
        int array[] = {1,-2,6,-1,3};
        Max_Subarray_Sum(array);
    }    
}

