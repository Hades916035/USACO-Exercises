public class MinInArray {
    public int min(int[] array) {
        if(array.length == 0) {
            return 0;
        }
        int min = array[0];
        for(int i=1; i<array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }
}
