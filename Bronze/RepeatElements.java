public class RepeatElements {
    public String[] repeatElements(String[] array, int numRepeats) {
        String arr[] = new String[array.length * numRepeats];
        for(int i=0; i<arr.length; i++) {
            arr[i] = array[i/numRepeats];
        }
        return arr;
    }
}
