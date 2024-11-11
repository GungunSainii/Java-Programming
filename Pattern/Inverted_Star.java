// package vscode.Pattern;
import java.util.*;
public class Inverted_Star {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num for the inverted star pattern :");
        int num = sc.nextInt();
        //First Logic
        for (int i = num ; i >= 1 ; i--){
            for ( int j = i ; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Logic
        for (int i = 1 ; i <= num ; i++){
            for (int j = 1 ; j <= 5-i ; j++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
    
}
// This is right angled Inverted Star Pattern 