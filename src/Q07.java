import java.util.Arrays;

public class Q07 {
    public static void merge(int[] arr1, int size1, int[] arr2, int size2) {
//        Given two sorted arrays. Sort the elements of these arrays so that first half of sorted elements will lie in first array and second half lies in second array. without creaitng new array
        int index = 0;
        int temp;
        while (index < size1) {
            if (arr1[index] <= arr2[0]) {
                index += 1;
            } else {
                // always first element of arr2 is compared.
                temp = arr1[index];
                arr1[index] = arr2[0];
                arr2[0] = temp;
                index += 1;
                // After swap arr2 may be unsorted.
                // Insertion of the element in proper sorted position.
                for (int i = 0; i < (size2 - 1); i++) {
                    if (arr2[i] < arr2[i + 1])
                        break;
                    temp = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = temp;
                }
            }
        }
    }
    // Test
    public static void main(String[] args) {
        int arr1[] = { 1, 5, 9, 10, 15, 20 };
        int arr2[] = { 2, 3, 8, 13 };
        merge(arr1, arr1.length, arr2, arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
