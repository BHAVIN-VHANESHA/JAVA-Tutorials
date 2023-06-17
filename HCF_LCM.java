import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int LCM = x * y / GCD(x,y);
        System.out.println(LCM);
        System.out.println(GCD(x,y));
    }
    public static int GCD(int x, int y) {
        return y==0? x:GCD(y,x % y);
    }
}
