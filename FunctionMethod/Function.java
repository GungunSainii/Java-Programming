// package vscode.FunctionMethod;

public class Function {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped Values a :" + a + "and b : " + b);

    }
    public static int multiplication(int a,int b){
        int product = a*b;
        return product;

    }
    public static int factorial(int n){
        int f = 1;
        for ( int i = 1 ; i <= n ; i++){
            f = f *i; 
                  
         }
         System.out.println(f);
        return f;

    }

    public static int bin_Coeff(int n,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);

        int binCoeff = n_fact/(r_fact * nmr_fact);

        System.out.println(binCoeff);

        return binCoeff;

    }

    public static boolean isPrime(int num){
        boolean isPrime = true;
        if ( num == 2){
            isPrime = true;
        }
        for ( int i =2 ; i <= num - 1 ; i++ ){
            if( num % i == 0){
                isPrime = false;
            }
        }
        return isPrime;


    }

    public static void Prime_Range(int num){
        for ( int i = 2 ; i <= num  ; i++){
            if ( isPrime(i) == true){
                System.out.print(i + " ");

            }
            
            
        }
        System.out.println();
        

    }
    public static void main(String args[]){
        int a = 5;
        int b = 2;
        swap(a,b);

        int product = multiplication(a,b);
        System.out.println(product);

        factorial(a);

        System.out.println(isPrime(a));

        Prime_Range(5);



    }
    
}
