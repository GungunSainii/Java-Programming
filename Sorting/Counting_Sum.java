package vscode.Sorting;

public class Counting_Sum {

    public static void countingSort(Integer arr[]){
        Integer largest = Integer.MIN_VALUE;
        for ( int i = 0 ; i < arr.length ; i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest + 1];
        for ( int i = 0 ; i < arr.length; i++){
            count[arr[i]]++;

        }
        //sorting
        int j = 0;
        for (int i = 0 ; i < count.length ; i++){
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void Print_array(Integer array[]){
        for (Integer i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        countingSort(arr);
        Print_array(arr);

    }
}








