package vscode.Sorting;

public class Selection_Sort {

    public static void Selection_Sort(int array[]){
        for ( int i = 0 ; i < array.length - 1 ; i++){
            int min = i;
            for ( int j = i + 1 ; j < array.length ; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            //Swap 
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }     
    }

    public static void Print_array(int array[]){
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String args[]){
        int array[] = {4,3,8,6,4,7};
        Selection_Sort(array);
        Print_array(array);

    }
    
}
