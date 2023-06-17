import java.util.*;

public class twoD_array_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //matrix transpose
//        System.out.println("enter number of rows");
//        int r = sc.nextInt();
//        System.out.println("enter number of column");
//        int c = sc.nextInt();
//
//        System.out.println("enter elements in rows and columns");
//        int[][] elements = new int[r][c];
//
//        for (int i = 0; i<r; i++) {
//            for (int j = 0; j<c; j++) {
//                elements[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("the transpose of a matrix is:");
//        for (int j = 0; j<c; j++) {
//            for (int i = 0; i<r; i++) {
//            System.out.print(elements[i][j] + " ");
//            }
//            System.out.println();
//        }

        // spiral order matrix
        System.out.println("enter the number of columns");
        int r = sc.nextInt();
        System.out.println("enter the number of rows");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}