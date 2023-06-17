import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        int div = 2;
        while(x > 1){
            while(x % div == 0){
                System.out.println(div);
                x /= div;
            }
        div++;
        }
    }
}