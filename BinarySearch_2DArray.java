import java.util.*;

public class BinarySearch_2DArray {

    static int[] binary_search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == target){
                return new int[]{row,col};
            }
            if (matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows and columns");
        int row = sc.nextInt();
        System.out.println("enter the elements");
        int[][] matrix = new int[row][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the number you want to find");
        int t = sc.nextInt();

        System.out.println(Arrays.toString(binary_search(matrix, t)));
    }
}