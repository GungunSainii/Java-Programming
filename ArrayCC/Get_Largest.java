public class Get_Largest {
    public static int Get_Largest(int array[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for ( int i = 0 ; i < array.length ; i++){
            if ( largest < array[i]){
                largest = array[i];
            }
            if ( smallest > array[i]){
                smallest = array[i];
            }
        }
        System.out.println("Smallest Value is :" + smallest);
        return largest;
        

    }
    public static void main(String args[]){
        int marks[] = {12,13,25,34,55,70};
        System.out.println("Largest Value is " + Get_Largest(marks));
    }
    
}
