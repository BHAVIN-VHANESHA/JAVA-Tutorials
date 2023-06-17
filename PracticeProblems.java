import java.util.*;

public class PracticeProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

//        System.out.println("enter the number");
//        int x = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= x; i++) {
//            sum += i;
//            System.out.println(sum);
//        }

        // 2.Take 2 numbers as inputs and find their HCF and LCM.

//        System.out.println("enter the two numbers");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        for (int i = 1; i <= num1 || i <= num2; i++) {
//            if (num1 % i == 0 && num2 % i == 0){
//                System.out.println(i);
//            }
//        }
        System.out.println();
    }

    private abstract class Book{
        String title;
        abstract void setTitle(String s);
        String getTitle(){
            return title;
        }
    }
    abstract class MyBook extends Book{
        MyBook novel = new MyBook() {
            @Override
            void setTitle(String s) {
                System.out.println("A tale of two cities");
            }
        };
    }
}