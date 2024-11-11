import java.util.*;
public class Binary_Search {
    public static int Binary_Search(int key, int array[]){
        int start = 0;
        int end = array.length - 1;//As Index value lies from 0 to n -1 
        
        while ( start <= end){
            int mid = (start + end)/2;
            if ( array[mid] == key){
                return mid;
            }
            if ( array[mid] > key) {
                end = mid - 1; 
            }
            if ( array[mid] < key){
                start = mid + 1;
            }
        }
        return -1;
        
       

    }
      
    public static void main(String args[]){
        int marks[] = { 34,56,78,78,88,91,93};
        int key = 0;
        System.out.println(" The index is :" + Binary_Search(key,marks));
        

    } 
}

// for ( int i = 0 ; i < array.length ; i++){ 
        //     if ( mid > key ){
        //         end = mid -1;
        //     } 
        //     else if ( mid == key){
        //         System.out.println("Index is :" + mid);
        //     } 
        //     else {
        //         start = mid + 1;
        //     }

            

        // } YOU ARE WRONG BCOZ IT WAS INDEX VALUES NOT THE VALUE AT THE INDEX IN ARRAY !
