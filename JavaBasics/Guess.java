// package vscode.JavaBasics;

import java.util.*;
public class Guess {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Guess the Number and then observe the pattern :");
            int a = sc.nextInt();
            if ( a%10 == 0){
                break;
            }

            System.out.println(a);

        }while(true);


    }
    
}
