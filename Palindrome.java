import java.util.Scanner;



public class Palindrome {
    static void palin(String s) {
        int i = 0;
        int j = s.length()-1;

        while (i <= j){
            if (s.charAt(i) != s.charAt(j)){
                System.out.println("Not Palin");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palin");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String s = sc.nextLine();

    }


}