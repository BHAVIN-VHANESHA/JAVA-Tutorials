import java.util.*;

public class loops {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

//        for (int g = 0; g <= 10; g++){
//            System.out.println(g);
//        }
//
//        int i = 0;
//        while (i<11){
//            System.out.println(i);
//            i++;
//        }
//
//        int b = 0;
//        do {
//            System.out.println(b);
//            b++;
//        }
//        while (b<=10);

        int sum = 0;
        int n = sc.nextInt();
        for (int a = 1; a<=n; a++){
            sum = sum + a;
            //System.out.println(sum);
        }
            System.out.println(sum);
    }
}
