import java.util.*;

public class conditional_statements {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

//        int month = sc.nextInt();
//        switch(month){
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("Jun");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//            default:
//                System.out.println("invalid input");
//        }

        //calculator
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();

        System.out.println("choose the operator to perform operations");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: *");
        System.out.println("4: /");
        System.out.println("5: %");

        int operator = sc.nextInt();

        if (operator==1)
            System.out.println(a+b);

        else if (operator==2)
            System.out.println(a-b);

        else if (operator==3)
            System.out.println(a*b);

        else if (operator==4)
            System.out.println(a*b);

        else if (operator==5)
            System.out.println(a%b);

        else
            System.out.println("invalid choice");
    }
}
