public class Staircase_Search {
    public static boolean Staircase_Search(int matrix[][] , int key){
        int row =0, col = matrix[0].length -1;
        while ( row < matrix.length && col >= 0){
            if (matrix[row][col] == key){
                System.out.println("Key is found (" + row + "," + col + ")");
                return true;
            }
            else if ( key < matrix[row][col]){
                col--;
            } else {
                row++;
            }

        }

        System.out.println("Key not found");
        return false;

    }
    public static void main (String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{11,22,33,44},{55,66,77,88}};
        int key = 3;
        Staircase_Search(matrix, key);
    }
    
}
