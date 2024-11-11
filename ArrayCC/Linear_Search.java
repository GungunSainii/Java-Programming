import java.util.*;
public class Linear_Search{
    public static int LinearSearch(int array[], int key){
        for ( int i = 0 ; i < array.length ; i++){
            if ( array[i] == key){
                return i;
            } 
        }
        return -1;


    }
    public static void main(String args[]){
        int age[] = {13,14,15,16,19,20,21,22};
        int key = 19;

        int index = LinearSearch(age ,key);

        if ( index == -1){
            System.out.println("Key does not exist");
        } else {
            System.out.println("The index is :" + index );
        }
        
        
    }
}