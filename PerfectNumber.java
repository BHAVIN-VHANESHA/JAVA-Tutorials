import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n   = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < n-1; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            System.out.println(sum + " " + "is perfect number");
        }
        else {
            System.out.println(sum + " " + "not a perfect number");
        }
    }
}
