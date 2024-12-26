public class Reverse2DArray {
    public static int[][] reverse(int[][] arr) {
        int reverse[][] = new int[arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                reverse[i][j] = arr[arr.length - i - 1][arr[0].length - j - 1];
            }
        }
        return reverse;
    }
}
