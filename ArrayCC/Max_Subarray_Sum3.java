public class Max_Subarray_Sum3 {
    
    public static void Kadanes(int array[]){
        //0 is better than any -ive integer in terms of finding max array sum.
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int ms_Neg = Integer.MIN_VALUE;//For dealing with test case where all elements are negative 

        for ( int i = 0 ; i < array.length ; i++){
            cs += array[i];
            ms_Neg = Math.max(array[i],ms_Neg);
            if ( cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        if(ms == 0){
            ms = ms_Neg;
        }
        System.out.println("Max array Sum :" + ms);
    }
    public static void main(String args[]){
        int array[] = {-1,-2,-6,-3,-4};
        Kadanes(array);
    }    
}
