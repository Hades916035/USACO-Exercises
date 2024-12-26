public class SumAll {
    public static int sumAll(int[][] arr) {
        int sum = 0;
        for(int[] row : arr) {
            for(int num : row) {
                sum += num;
            }
        }
        return sum;
    }
}
