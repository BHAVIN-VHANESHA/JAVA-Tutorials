import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(0,6);
        for (int i:list) {
            for (int j:list) {
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}
