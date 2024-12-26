public class ShiftLeft {
    public static int[] shiftLeft(int[] arr) {
        int holder = arr[0];
        for(int i=1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = holder;
        return arr;
    }
}
