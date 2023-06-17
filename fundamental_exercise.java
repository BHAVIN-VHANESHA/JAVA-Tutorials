import java.util.*;


public class fundamental_exercise {

//    public static int average(int a, int b, int c){
//        int avg = a + b + c;
//        avg = avg/3;
//        System.out.println(avg);
//        return avg;
//    }

    //sum of odd
//    public static void sumodd(int n){
//        int sum = 0;
//        for (int i = 1; i<=n; i++) {
//            if (i % 2 != 0){
//                sum = sum + i;
//            }
//        }
//                System.out.println("the sum is: " + sum);
//    }

    //greatest number
//    public  static int greatest(int a, int b){
//        return (a>b) ? a : b;
//        if (a>b) {
//            System.out.println("a is greater: " + a);
//        }
//        else {
//            System.out.println("b is greater: " + b);
//        }
//     }

    //circumference
//    public static void circumference( int r){
//        double c = 2 * 3.14 * r;
//        System.out.println(c);
//    }

    //vote
//    public static void vote(int n) {
//        if (n > 18) {
//            System.out.println("you are elegible for vote");
//        }
//        else {
//            System.out.println("your age is lessthan 18");
//        }
//    }

    //power
//    public static void power(int x, int n){
//        int pow = (int)Math.pow(x,n);
//        System.out.println(pow);
//    }

    //gcd
//    public static int gcd(int a, int b){
////        return(b==0)? a:gcd(b, a % b);
//        while(b!=0){
//            int rem = a % b;
//            a=b;
//            b=rem;
//        }
//        return a;
//    }

    //fibonacci
//    public static void fibo(int n){
//
//        int a = 0, b = 1, c;
//        System.out.print(a + " " + b);
//        for (int i = 1; i<=n; i++) {
//            c = a + b;
//            System.out.print(" " + c);
//            a = b;
//            b = c;
//        }
//    }


    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        //fibonacci
//        System.out.println("enter the number");
//        int n = sc.nextInt();
//        fibo(n);

        //gcd
//        System.out.println("enter first number");
//        int a = sc.nextInt();
//        System.out.println("enter thr second number");
//        int b = sc.nextInt();
//        System.out.println("gcd is: " + gcd(a,b));

        //power
//        System.out.println("enter the number");
//        int x = sc.nextInt();
//        System.out.println("enter the power of number");
//        int n = sc.nextInt();
//        power(x,n);

        //average
//      System.out.println("enter the first value");
//      int a = sc.nextInt();
//      System.out.println("enter the second value");
//      int b = sc.nextInt();
//      System.out.println("enter the third value");
//      int c = sc.nextInt();
//
//      average(a,b,c);

        //sum of odd
//      System.out.println("enter the value to check odd number");
//      int n = sc.nextInt();
//      sumodd(n);

        //greater
//      int a = sc.nextInt();
//      int b = sc.nextInt();
//      System.out.println(greatest(a,b));

        //circumference
//      System.out.println("enter the radius");
//      int r = sc.nextInt();
//      circumference(r);

        //vote
//      System.out.println("enter your age");
//      int n = sc.nextInt();
//      vote(n);

        //infinite loop
//        while (true){
//            System.out.println("bhavin");
//        }

        //count of number entered
//        System.out.println("enter the number");
//        int num = sc.nextInt();
//        int pos=0,zero=0,neg=0;
//        while(num>0){
//
//            int a = sc.nextInt();
//            if(a<0)neg++;
//            else if(a==0)zero++;
//            else{pos++;}
//
//            num--;
//        }
//        System.out.println("Positive: "+pos);
//        System.out.println("Zero: "+zero);
//        System.out.println("Negative: "+neg);

        char ch = sc.next().trim().charAt(0);
        System.out.println(ch);
//        String str = sc.next();
//        System.out.println(str);

        //bhavin vhanesha
    }
}