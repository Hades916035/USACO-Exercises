public class ArraySum {
    public double arraySum(double[] array) {
        double sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
