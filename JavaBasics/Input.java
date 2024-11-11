// package vscode.JavaBasics;

import java.util.*;

public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        /* int a = sc.nextInt();
        System.out.println(a);

        boolean b = sc.nextBoolean();
        System.out.println(b);

        short c = sc.nextShort();
        System.out.println(c);

        long d = sc.nextLong();
        System.out.println(d);

        float area = 3.14f*d*d ;

        System.out.println(area); */

        float p = 25.178f;
        int q = (int)p;
        System.out.println(q);

        char a = 'a';              //ASCII VALUE 
        int b = a;
        System.out.println(b);

        


        }
    
}
//Types of Input Fxn mentioned in NB
// Any Decimal Value - Considered as double by default
// To make it Integer use NOf --3.14f

// byte>short>int>float>long>float (Size of DataType - Related to Destination Type > Source Type)
//Lossy Conversion error - When reverse happens
//Type Conversion / Widenning / Implicit 


//Narrowing/Explicit/Type Casting - Willingly to lose data


