import java.util.*;

public class AmountIncreasing {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 4, 5, 1, 6, 7, 0, 8, 9};
        int arr2[] = {2, 0, -1, -2};
        int arr3[] = {2, 0, 0, 1};
        System.out.println(maxSize(arr1));
        System.out.println(maxSize(arr2));
        System.out.println(maxSize(arr3));
    }

    public static int maxSize(int[] arr) {
        int maxSize = 1;
        int size = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1] <= arr[i]) {
                size++;
            } else {
                size = 1;
            }
            maxSize = Math.max(maxSize, size);
        }

        return maxSize;
    }
}