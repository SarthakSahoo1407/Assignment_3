import java.util.Arrays;

public class Q09 {
    public static void sortArray(int arr[]){
       //insertion sort
         int temp;
            for (int i = 1; i < arr.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
                }
            }
    }
    public static int findMin(int arr[], int size) {
        return arr[0];
    }
    public static int findMax(int arr[], int size) {
        return arr[size-1];
    }
    public static int findMedian(int arr[], int size) {
        return arr[size/2];
    }
    public static void main(String[] args) {
        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
        sortArray(arr);
        System.out.println("Minimum element is: "+findMin(arr, arr.length));
        System.out.println("Maximum element is: "+findMax(arr, arr.length));
        System.out.println("Median element is: "+findMedian(arr, arr.length));

        System.out.println(Arrays.toString(arr));
    }
}
