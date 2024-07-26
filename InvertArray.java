public class InvertArray {
    public static int[][] invert(int[][] arr) {
        int inverted[][] = new int[arr[0].length][arr.length];
        for(int i=0; i<arr.length; i++) {
            for( int j=0; j<arr[0].length; j++) {
                inverted[j][i] = arr[i][j];
            }
        }
        return inverted;
    }
}
