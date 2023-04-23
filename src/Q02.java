import java.util.Arrays;

public class Q02 {
    public static void partition012(int[] arr, int size){
        int left = 0;
        int right = size - 1;
        int mid = 0;
        while (mid <= right) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, left, mid);
                    left += 1;
                    mid += 1;
                    break;
                case 1:
                    mid += 1;
                    break;
                case 2:
                    swap(arr, mid, right);
                    right -= 1;
                    break;
            }
        }
    }
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2};
        partition012(arr, arr.length);
        System.out.println("Array after segregation: " + Arrays.toString(arr));
    }
}
