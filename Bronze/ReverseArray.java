public class ReverseArray {
    public int[] reverse(int[] arr) {
        int reverse[] = new int[arr.length];
        int length = arr.length - 1;
        for(int i=0; i<length+1; i++) {
            reverse[i] = arr[length - i];
        }
        return reverse;
    }
}
