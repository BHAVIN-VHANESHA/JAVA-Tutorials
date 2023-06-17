import java.util.*;

public class array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //program of searching a number in2D array
//        System.out.println("enter the number of rows");
//        int r = sc.nextInt();
//        System.out.println("enter thr number of columns");
//        int c = sc.nextInt();
//        System.out.println("enter row and column numbers");
//        int[][] numbers = new int[r][c];
//
//        for (int i = 0; i<r; i++) {
//            for (int j = 0; j<c; j++) {
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("enter the number you want to search from 2D array");
//        int x = sc.nextInt();
//
//        for (int i = 0; i<r; i++) {
//            for (int j = 0; j<c; j++) {
//                if (numbers[i][j] == x){
//                System.out.println("the number you were finding in 2D matrix is: " + numbers[i][j] + " at index: " + "(" + i + "," + j + ")");
//                }
//            }
//        }

        // n*n matrix multiplication
        //matrix 1
        System.out.println("enter the number of rows");
        int a = sc.nextInt();
        System.out.println("enter the number of columns");
        int b = sc.nextInt();
        System.out.println("enter the numbers in matrix");

        int[][] matrix = new int[a][b];

        for (int i = 0; i<a; i++) {
            for (int j = 0; j<b; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //matrix 2
        System.out.println("enter the number of columns for second matrix");
        int c = sc.nextInt();
        System.out.println("enter the numbers in matrix2");

        int[][] matrix2 = new int[b][c];

        for (int i = 0; i<b; i++) {
            for (int j = 0; j<c; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int mul[][] = new int[a][c];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                mul[i][j]=0;
                for (int k = 0; k < b; k++) {
                    mul[i][j]+=matrix[i][k]*matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mul[i][j]+" ");

            }
            System.out.println();

        }
    }
}
