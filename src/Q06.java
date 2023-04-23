import java.util.Arrays;

public class Q06 {
    public static void ArrayReduction(int[] arr, int size) {
        Arrays.sort(arr);
        int count = 1;
        int reduction = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] - reduction > 0) {
                System.out.println(size - i);
                reduction = arr[i];

                count += 1;
            }
        }
        System.out.println("Total number of reductions " + count);

    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 4, 8, 1,6, 7, 5 };
        int size = arr.length;
        ArrayReduction(arr, size);
    }
}
