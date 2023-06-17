import java.util.*;


public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //defining an array(type 1)
        // type[] ArrayName = new type [size];

        //type 2
        //type[] ArrayName = {size of array};

        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("enter the number according to the size of array");
        int[] numbers = new int[n];

        for (int i = 0; i<n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("enter the you want to find");
        int x = sc.nextInt();

        for (int i = 0; i<n; i++) {    //agar user ke pass se input nahi liya to array ka length (ArrayName.length) likh ke pata lkaga sakte hai
            if (numbers[i] == x){
            System.out.println("the number x is present at index: " + i);
            }
            else {
                System.out.println("no number found in the list");
            }
        }
    }
}
