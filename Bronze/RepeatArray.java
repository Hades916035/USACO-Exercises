public class RepeatArray {
    public String[] repeatArray(String[] array) {
        String arr[] = new String[array.length * 2];
        for(int i=0; i<array.length; i++) {
            arr[i] = array[i];
        }
        for(int i=array.length; i<arr.length; i++) {
            arr[i] = array[i - array.length];
        }
        return arr;
    }
}
