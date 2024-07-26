public class MagicSquare {
    public static boolean magical(int[][] square) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        if(square.length != square[0].length) {
            return false;
        }
        
        int sum = 0;
        for(int i : square[0]) {
            sum += i;
        }
        
        int checkDiagonal1 = 0;
        int checkDiagonal2 = 0;
        for(int i=0; i<square.length; i++) {
            int checkCol = 0;
            int checkRow = 0;
            for(int j=0; j<square[0].length; j++) {
                if(nums.contains(square[i][j])) {
                    return false;
                } else {
                    nums.add(square[i][j]);
                }
                checkCol += square[j][i];
                checkRow += square[j][i];
            }
            if(checkCol != sum || checkRow != sum) {
                return false;
            }
            checkDiagonal1 += square[i][i];
            checkDiagonal2 += square[square.length - i - 1][square.length - i - 1];
        }
        if(checkDiagonal1 != sum || checkDiagonal2 != sum) {
            return false;
        }
        
        return true;
    }
}
