import java.util.Scanner;

public class MAX_MIN_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        MAX(a,b,c);
        MIN(a,b,c);
    }

    public static void MAX(int a, int b, int c){
        if (a > b && a > c){
            System.out.println(a + " is greater");
        }
        else if (a < b && b > c){
            System.out.println(b + " is greater");
        }
        else {
            System.out.println(c + " is greater");
        }
    }

    public static void MIN(int a, int b, int c){
        if (a < b && a < c){
            System.out.println(a + " is smallest");
        }
        else if (a > b && b < c){
            System.out.println(b + " is smaller");
        }
        else {
            System.out.println(c + " is smaller");
        }
    }
}
