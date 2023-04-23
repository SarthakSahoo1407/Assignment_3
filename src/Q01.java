import java.util.Arrays;

public class Q01 {
    public static int partition01(int arr[]){
        int size = arr.length;
        int left = 0;
        int right = size - 1;
        int count = 0;
        while (left < right) {
            while (arr[left] == 0)
                left += 1;
            while (arr[right] == 1)
                right -= 1;
            if (left < right) {
                swap(arr, left, right);
                count += 1;
            }
        }
        System.out.println("Array after partitioning: " + Arrays.toString(arr));
        return count;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1,0, 1, 0, 1};
        System.out.println(partition01(arr));
    }
}
