// package vscode.JavaBasics;

public class Reverse_Num {
    public static void main(String args[]){
        int a = 1456789;
        while(a>0){
            int lastdigit = a%10;
            System.out.print(lastdigit);
            a = a/10;

        }
    }
    
}
