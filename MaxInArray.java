public class MaxInArray {
    public int max(int[] array) {
        if(array.length == 0) {
            return 0;
        }
        int max = array[0];
        for(int i=1; i<array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
}
