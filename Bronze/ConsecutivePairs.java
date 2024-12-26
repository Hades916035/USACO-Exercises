public class ConsecutivePairs {
    public static boolean pairs(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                return true;
            }
        }
        return false;
    }
}
