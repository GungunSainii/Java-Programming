
public class Print_Subarrays {

    public static void Print_Subarrays(int array[]){
        
        int ts = 0;
        
        for ( int i = 0; i < array.length ; i++){
            for ( int j = i ; j < array.length ; j++){
                for ( int k = i ; k <= j ; k++){
                    System.out.print(array[k] + " ");
                    
                }
                ts++;
                
                System.out.println();
                
            }
            System.out.println();
        }
        System.out.println("Total Subarrays :" + ts);
        

    }
    
    public static void main(String args[]){
        int num[] = {1,2,3,4,5,6,7,8};
        Print_Subarrays(num);
        

    }
    
}
