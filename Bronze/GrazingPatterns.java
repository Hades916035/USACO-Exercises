import java.util.*;

public class GrazingPatterns{
    private static int count=0;
    public static ovid main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int rows = kb.nextInt();
        int cols = kb.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=i; j<cols; j++) {
                String x = kb.next();
                if(x.equals("G"))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
    }

    public static void simul(int[][] arr, int[] a, boolean b) {

    }
}