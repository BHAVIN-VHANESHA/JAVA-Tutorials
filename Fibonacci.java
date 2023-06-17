import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int x = sc.nextInt();

        int a = 0, temp, b = 1;
        for (int i = 1; i < x; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        System.out.print(" " + b);
    }
}