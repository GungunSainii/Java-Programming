// package vscode.Pattern;
import java.util.*;
public class Star_Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num to create right angle star pattern :");
        int num = sc.nextInt();
        for ( int i = 1 ; i <= num ; i++ ){
            for ( int j =1 ; j <= i ; j++ ){
                System.out.print("*");

            }
            System.out.println();
        }
        

    }
    
}
