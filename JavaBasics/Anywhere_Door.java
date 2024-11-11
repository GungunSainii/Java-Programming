// package vscode.JavaBasics;
import java.util.*;
public class Anywhere_Door{
    public static void main(String args[]){
        System.out.println("WELCOME\n Where would you like to go ? \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("1)Naruto Universe\n2)Marvel Universe\n3)Fairy Tail Universe\n");
        int Num = sc.nextInt();
        switch(Num){
            case 1 : System.out.println("Hey you can explore me on Hianime website.BELIEVE IT !!");
                        break;
            case 2 : System.out.println("Want to get inspire to create JARVIS? Go to amazon prime");
                        break;
            case 3 : System.out.println("Want to join Fairy Tail? Come with Me !");
                        break;
            default : System.out.println("PLZ GO BY YOUR OWN !!");
        }

    }
}