package vscode.Sorting;

public class Insertion_Sort {
    public static void Insertion_Sort(int array[]){
        for (int i = 1 ; i < array.length ; i++ ){
            int curr = array[i];
            int prev = i -1 ;
            //finding out the correct pos to insert
            while ( prev >= 0 && array[prev] > curr){
                array[prev + 1] = array[prev];
                prev--;
            } 
            //insertion
            array[prev + 1] = curr;
        }
    }
    public static void Print_array(int array[]){
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String args[]){
        int array[] = {3,6,4,2,8};
        Insertion_Sort(array);
        Print_array(array);
    }    
}
