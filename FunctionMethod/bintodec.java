// package vscode.FunctionMethod;

public class bintodec {
    public static void bintodec(int num){
        int Onum = num;
        int decNum = 0;
        int pow = 0;
        while(num > 0){
            int lastdigit = num%10;
            decNum = decNum + (lastdigit * (int)Math.pow(2,pow));

            pow++;
            num = num/10;
        }
        System.out.println("Decimal " + Onum + " =" + decNum);

    }

    public static void dectobin(int num){
        int MyNum = num;
        int pow = 0;
        int Dnum = 0;
        while( num > 0){
            int rem = num % 2 ;
            Dnum = Dnum +(rem *(int) Math.pow(10,pow));
            pow++;
            num = num/2;
        }
        System.out.println("Binary Form :" + MyNum + "=" + Dnum);
    }

    public static void main(String args[]){
        bintodec(1000);
        dectobin(8);

    
    }
    
}

