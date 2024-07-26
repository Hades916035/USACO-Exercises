public class ConsecutiveValues {
    public static boolean consecutive(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(j>=1 && arr[i][j] == arr[i][j-1]) {
                    return true;
                }
                if(i>=1 && arr[i][j] == arr[i-1][j]) {
                    return true;
                }
            }
            if(i>0 && arr[i-1][arr[0].length-1] == arr[i][0]) {
                return true;
            }
        }
        return false;
    }
}
