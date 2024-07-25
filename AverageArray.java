public class AverageArray {
    public double average(int[] array) {
        if(array.length == 0) {
            return 0;
        }
        double avg = 0;
        for(int i=0; i<array.length; i++) {
            avg += array[i];
        }
        avg /= array.length;
        return avg;
    }
}
