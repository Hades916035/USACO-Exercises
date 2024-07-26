public class SplitArray {
    public static int[][] split(int[][] arr, int row, int col) {
        int result[][] = new int[row + 1][col + 1];
        for(int i=0; i<=row; i++) {
            for(int j=0; j<=col; j++) {
                result[i][j] = arr[i][j];
            }
        }
        return result;
    }
}
