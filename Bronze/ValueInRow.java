public class ValueInRow {
    public static boolean hasValue(int[][] arr, int value, int row) {
        if(arr.length <= row) {
            return false;
        }
        for(int i : arr[row]) {
            if(i == value) {
                return true;
            }
        }
        return false;
    }
}
