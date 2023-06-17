import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] insert = {5,4,8,2,6,3,7,9,1,-10,0};
        Insertion(insert);
        System.out.println(Arrays.toString(insert));
    }
    public static void Insertion(int[] insert){
        for (int i = 0; i < insert.length; i++) {
            for (int j = 1; j < insert.length; j++) {
                if (insert[i] > insert[j]){
                    int temp = insert[i];
                    insert[i] = insert[j];
                    insert[j] = temp;
//                    if (insert[j] > insert[j-1]){
//                        break;
//                    }
                }
            }
        }
    }
}