public class BinarySearchQuestions {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 6, 7, 9, 10};
        int target = 9;
        int ans = Search(array, target);
        System.out.println(ans);
    }

    public static int Search(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}