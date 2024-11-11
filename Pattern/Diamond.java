// package vscode.Pattern;

public class Diamond {
    public static void Diamond(int n){
        for ( int i = 1 ; i <= n ; i++){
            //Spaces
            for ( int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            //Star
            for ( int j = 1 ; j <= 2*i - 1 ; j++){
                System.out.print("*");
            }

            //Spaces
            for ( int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for ( int i = n ; i > 0 ; i--){
            //Spaces
            for ( int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            //Star
            for ( int j = 1 ; j <= 2*i - 1 ; j++){
                System.out.print("*");
            }

            //Spaces
            for ( int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }


    }

    public static void main(String args[]){
        Diamond(4);
    }
    
}
