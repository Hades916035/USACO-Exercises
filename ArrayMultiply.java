public class ArrayMultiply {
    public double[] multiplyArray(double[] array, double value) {
        for(int i=0; i<array.length; i++) {
            array[i] *= value;
        }
        return array;
    }
}
