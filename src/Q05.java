import java.util.Arrays;

public class Q05 {
    public static void seperateEvenAndOdd(int data[], int size) {
        int left = 0;
        int right = size - 1;
        while (left < right) {
            while (data[left] % 2 == 0)
                left += 1;
            while (data[right] % 2 != 0)
                right -= 1;
            if (left < right) {
                swap(data, left, right);
            }
        }
    }
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        seperateEvenAndOdd(arr, arr.length);
        System.out.println("Array after segregation: " + Arrays.toString(arr));
    }
}
