import java.math.BigInteger;
import java.util.Scanner;

public class Sum_of_X_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int x = sc.nextInt();
        int a = 0;
        for (int i = 1; i <= x; i++) {
            a = a + i;
        }
        System.out.println(a);
    }
}
