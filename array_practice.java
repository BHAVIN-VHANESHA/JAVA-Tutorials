import java.util.*;

public class array_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //name array
//        System.out.println("enter the length of name you want to print");
//        int n = sc.nextInt();
//        System.out.println("enter the name");
//        String[] name = new String[n];
//
//        //input from user
//        for (int i = 0; i<n; i++) {
//            name[i] = sc.next();
//        }
//
//        //output
//        for (int i = 0; i<n; i++) {
//            System.out.println("name: " + i + " " + name[i]);
//        }

        // min-max
//        System.out.println("entr the number to decide size of array");
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//        //input
//        for(int i=0; i<size; i++) {
//            numbers[i] = sc.nextInt();
//        }
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for(int i=0; i<numbers.length; i++) {
//            if(numbers[i] < min) {
//                min = numbers[i];
//            }
//            if(numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//
//        System.out.println("Largest number is : " + max);
//        System.out.println("Smallest number is : " + min);

        //sort array
        System.out.println("enter the number for length of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
            if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
                isAscending = false;
            }
        }

        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}