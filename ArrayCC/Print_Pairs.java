public class Print_Pairs {
    
    public static void Print_Pairs( int array[]){
        int Total_Pairs = 0;
        for (int i = 0 ; i < array.length ; i++){
            for ( int j = i + 1 ; j < array.length ; j++){
                System.out.print("(" + array[i] + "," + array[j] + ")");
                Total_Pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs :" + Total_Pairs);

    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5,6,7,8,9};
        Print_Pairs(num);

    }
    
}
//Sum of n-1 terms = (n-1)*n/2