import java.util.Arrays;

public class Q03 {
    public static void RangePartition(int[] arr, int size, int lower, int higher){
        int left = 0;
        int right = size - 1;
        int mid = 0;
        while (mid <= right) {
            if (arr[mid] < lower) {
                swap(arr, left, mid);
                left += 1;
                mid += 1;
            } else if (arr[mid] > higher) {
                swap(arr, mid, right);
                right -= 1;
            } else {
                mid += 1;
            }
        }
    }
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    //driver code
    public static void main(String[] args) {
        int arr[] = {1, 21, 2, 20, 3, 19, 4, 18, 5, 17, 6, 16, 7, 15, 8, 14, 9, 13, 10, 12, 11};
        int size = arr.length;
        int lower = 5;
        int higher = 15;
        RangePartition(arr, size, lower, higher);
        System.out.println("Array after range partitioning: " + Arrays.toString(arr));
    }
}
