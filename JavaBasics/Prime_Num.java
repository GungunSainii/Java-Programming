// package vscode.JavaBasics;

import java.util.*;

public class Prime_Num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num :");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num == 2){
            System.out.println("It is Prime");
        } else {
            for ( int i = 2 ; i <= num -1 ; i++){ //Can also use i <= Math.sqrt(n);
                if ( num%i == 0 ){
                    isPrime = false;
                }
            }
    
            if (isPrime == true){
                System.out.println("It is prime num");
            } else {
                System.err.println("It is not a prime num");
            }
        }

    }
    
}
