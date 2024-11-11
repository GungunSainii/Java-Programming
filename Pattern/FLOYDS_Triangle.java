// package vscode.Pattern;

public class FLOYDS_Triangle {
    public static void FLOYDS_Triangle(int num){
        int var = 1;
        for ( int i =1 ; i <= num ;i++){
            for ( int j = 1 ; j <= i ; j++){
                System.out.print(var + " ");
                var++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        FLOYDS_Triangle(5);
    }
}
