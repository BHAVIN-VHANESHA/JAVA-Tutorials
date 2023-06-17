import java.util.*;

public class advance_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value to print patterns");
        int n = sc.nextInt();
        //int m = sc.nextInt();

//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//
//            //stars
//            for(int j=1; j<=n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i<=n; i++) {
//            for (int j = 1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j<=i; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i<=n; i++) {
//            for (int j = 1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j>=1; j--) {
//                System.out.print(j);
//            }
//            for (int j = 2; j<=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        for (int i = 1; i<=n; i++) {
//            for (int j = 1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j<=2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n; i>=1; i--) {
//            for (int j = 1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j<=2*i-1; j++) {
//                System.out.print("*");
//            }
//                System.out.println();
//        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = 1; i<=n; i++) {
//
//            for (int j = 1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            if(i==1) {
//                for (int j = 1; j <= n; j++) {
//                    System.out.print("*");
//                }
//            }
//            else if(i==n) {
//                for (int j = 1; j <= n; j++) {
//                    System.out.print("*");
//                }
//            }
//            else {
//                for (int j = 1; j <= n; j++) {
//                    if(j==1)
//                    System.out.print("*");
//                    else if(j==n)
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
    }
}