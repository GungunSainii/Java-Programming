package vscode.Sorting;

public class Bubble_Sort {
    public static void Bubble_Sort(int array[]){
        for ( int i = 0 ; i < array.length-1 ; i++){
            for ( int j =0 ; j < array.length-1-i; j++){
                if (array[j] > array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }   
        }
    }
    public static void Print_array(int array[]){
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String args[]){
        int array[] = {4,7,3,5,2};
        Bubble_Sort(array);
        Print_array(array);
    }
    
}
