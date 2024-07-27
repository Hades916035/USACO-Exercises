public class AmountIncreasing {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 1, 6, 7, 0, 8, 9};
        System.out.println(maxSize(arr));
    }

    public static void maxSize(int[] arr) {
        int maxSize = 1;
        int size = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1] < arr[i]) {
                size++;
            } else {
                size = 0;
            }
            maxSize = Math.max(maxSize, size);
        }
    }
}