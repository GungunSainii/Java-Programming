// package vscode.ArrayCC;

import java.util.*;

public class array_creation {
    public static void main(String args[]){
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); //Phy
        marks[1] = sc.nextInt(); //Math
        marks[2] = sc.nextInt(); //Chem

        System.out.println("Phy :" + marks[0]);
        System.out.println("Math :" + marks[1]);
        System.out.println("Chem :" + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage :" + percentage);

        // marks[2] = marks[2] + 10;
        // System.out.println("Updated Marks :" + marks[2]);

        System.out.println("Length of array :" + marks.length);

        


    }
    
}
