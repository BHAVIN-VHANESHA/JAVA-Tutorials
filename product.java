import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entr the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(product(a,b));
    }

    public static int product(int a, int b){
        int c = a * b;
        return c;
    }
}
