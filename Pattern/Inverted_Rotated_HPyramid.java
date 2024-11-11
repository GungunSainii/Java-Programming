// package vscode.Pattern;

public class Inverted_Rotated_HPyramid {
    public static void Invert_Rotated_HPyramid(int num){
        for ( int i = 1 ; i <= num ; i++ ){
            for (int j = 1 ; j <= num - i ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        Invert_Rotated_HPyramid(5);
    }
    
}
