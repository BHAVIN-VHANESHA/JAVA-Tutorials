import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] bubble = {5,1,4,9,6,10,8,15,2};
        BubbleSort(bubble);
        System.out.println(Arrays.toString(bubble));
    }

    public static void BubbleSort(int[] bubble) {
        for (int i = 0; i < bubble.length; i++) {
            for (int j = 1; j < bubble.length; j++) {
                if (bubble[j] < bubble[j - 1]){
                    int temp = bubble[j];
                    bubble[j] = bubble[j-1];
                    bubble[j-1] = temp;
                }
            }
        }
    }
}