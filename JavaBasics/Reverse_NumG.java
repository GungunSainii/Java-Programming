// package vscode.JavaBasics;

import java.util.*;
public class Reverse_NumG {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num to be reversed :");
        int a = sc.nextInt();
        int rev = 0;
        while(a>0){

            int lastdigit = a%10;
            rev = (rev*10) + lastdigit; 
            a = a/10;
        }
        System.out.println(rev);
        

    }
    
}
