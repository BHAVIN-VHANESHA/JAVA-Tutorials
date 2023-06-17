import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  find even number of digits in list
        System.out.println("enter the size of numbers");
        int x = sc.nextInt();

        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = sc.nextInt();
        }

        int ct=0;
        for (int i = 0; i < x; i++) {
            if(check(array[i]))
                ct++;
        }

        System.out.println(ct);
    }

    static int count(int num){
        if (num <= 0){
            return -1;
        }
        int ct = 0;
        while (num > 0){
            num = num / 10;
            ct++;
        }
        return ct;
    }

    static boolean check(int num){
        int dig = count(num);
        return dig % 2 == 0;
    }
}