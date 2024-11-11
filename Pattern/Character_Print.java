// package vscode.Pattern;
import java.util.*;
public class Character_Print {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num to print half pyramid :");
        int num = sc.nextInt();
        char var = 'A';
        for (int i = 1 ; i <= num ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(var);
                var++;
            }
            System.out.println();
        }


    }
    
}
