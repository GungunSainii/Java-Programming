// package vscode.JavaBasics;

import java.util.*;
public class Even_OddSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Odd_Sum = 0;
        int Even_Sum = 0;
        for (int i = 1 ; i <= 5 ; i++){
            System.out.println("Enter the five value to calculate the value even or odd sum :");
            int num = sc.nextInt();
            if( num % 2 == 0){
                Even_Sum += num;
            } else {
                Odd_Sum += num;
            }
            

        }
        System.out.println("Odd Sum :" + Odd_Sum );
        System.out.println("Even Sum :" + Even_Sum);

    }
    
}
