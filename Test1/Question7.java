public class Question7 {

    public static int maxDifference(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        int minElement = arr[0];
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > minElement) {
                maxDiff = Math.max(maxDiff, arr[i] - minElement);
            } else {
                minElement = arr[i];
            }
        }

        return maxDiff == Integer.MIN_VALUE ? 0 : maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};

        System.out.println(maxDifference(arr));
    }
}
