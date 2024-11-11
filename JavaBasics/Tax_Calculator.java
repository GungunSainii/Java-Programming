// package vscode.JavaBasics;

import java.util.*;

public class Tax_Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary to know Tax against it :) :: ");
        long Salary = sc.nextLong();
        double tax = 0;
        if (Salary < 500000){
            tax = 0;
        }else if (Salary >= 500000 && Salary < 1000000 ){
            tax = 0.2*(Salary);
        }else {
            tax = 0.2*(Salary - 500000);
        }

        System.out.println("Tax is :" + tax);

    }
    
}
//Information is assumed for the practice.