// package vscode.ArrayCC;


public class array_fxn_arguement {
    public static void update(int marks[]){
        for ( int i =0 ; i < marks.length ; i++){
            marks[i] = marks[i] + 3;

        }
    }
    public static void main(String args[]){
       
        int marks[] = { 56,67,87};

        
        update(marks);

        for ( int i =0 ; i <marks.length ; i++){
            System.out.println(marks[i]);
        }
        System.out.println();

    }
    
}
