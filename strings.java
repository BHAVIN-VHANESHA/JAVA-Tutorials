import java.util.*;

public class strings {
    public static void main(String[] args) {
        String name = "bhavin";
        String b = "bhavin";
        b = "vhanesha";
       String s = new String("bhavin");
        System.out.println(b);
        //concatenation
        //string.length()
        //charAt() it print all character by index value. Also we can print the specific character
        //compare string length -> string1.compare(string2). It compares 3 things <, ==, >.
        // s1 > s2 : return any +ve value
        //s1 == s2 : return 0
        //s1 < s2 : return -ve value
        //substring -> substring(beg index, end index)
        // String name  = name.substring(1,5 or name.substring()) so here the output will be till 4th index number not till 5
        //and if fwe don't pass the ending index by default it will consider the last element
        //strings are immutable. once the string is created in memory than we cannot modify the string.And to modify the string we need to create new string

//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number);

        //to access specific char in string
        String c = String.valueOf(b.charAt(0));
        System.out.println(c);
    }
}
