public class Reverse_Array {
    public static void Reverse_Array(int array[]){ //Void - As we are just reversing the array
        int start = 0; 
        int end = array.length - 1 ;
        while (start < end){
            int temp = array[start]; //SWAP CODE
            array[start] = array[end]; 
            array[end] = temp;
            start++;
            end--;

        }

    }
    public static void main(String args[]){
        int marks[] = {23,45,34,6,44,88,99,22,44};
        Reverse_Array(marks);
        for ( int i = 0 ; i < marks.length ; i++){
            System.out.print(marks[i] + " ");
        }

    }
    
}



// Dont Do : int array[start] = array[end]; as this implies that new array is created and its shows erroe for its correct syntax.