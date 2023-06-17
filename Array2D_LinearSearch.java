import java.util.*;

public class Array2D_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of elements in row");
        int row = sc.nextInt();

        int[][] bank_account = new int[row][row];

        int max = 0;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                bank_account[i][j] = sc.nextInt();
                sum += bank_account[i][j];
            }
            if (max < sum){
                max = sum;
            }
        }
        System.out.println("the maximum balance is");
        System.out.println(max);
    }
}