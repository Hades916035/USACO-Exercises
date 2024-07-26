public class Empty2DArray {
    public static String[][] createArray(int row, int col) {
        String arr[][] = new String[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                arr[i][j] = "";
            }
        }
        return arr;
    }
}
