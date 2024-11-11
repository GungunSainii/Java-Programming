package vscode.Sorting;

import java.util.*;

public class Inbuilt_Sort {

    public static void Print_array(int array[]){
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String args[]){
        int array[] = {5,7,4,3,8};
        Arrays.sort(array);
        Print_array(array);
    }
    
}
