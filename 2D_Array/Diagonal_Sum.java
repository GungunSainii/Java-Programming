public class Diagonal_Sum {
    /*public static int Diagonal_Sum(int matrix[][]){
        int sum = 0;
        for (int i = 0;i < matrix.length ; i++){
            for (int j = 0;j< matrix[0].length ; j++){
                if (i==j){
                    sum += matrix[i][j];
                }
                else if (i+j == matrix.length - 1){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("SUM:" + sum);
        return sum;
    } */

    public static int Diagonal_Sum(int matrix[][]){
        int sum = 0;
        for (int i = 0 ; i < matrix.length ; i++){
            sum += matrix[i][i];
            if ( i != matrix.length - 1-i)
            sum += matrix[i][matrix.length -1 -i];
        }

        System.out.println("Sum:" +sum);
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{1,3,5,7},{2,4,6,8}};
        Diagonal_Sum(matrix);

    }
    
}
