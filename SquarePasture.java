import java.util.*;
import java.io.*;

public class SquarePasture {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("square.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));

        int[][] fence = new int[2][4];
        for(int i=0; i<2; i++) {
            String[] y = br.readLine().split(" ");
            for(int j=0; j<4; j++) {
                fence[i][j] = Integer.parseInt(y[j]);
            }
        }

        int[] points = fence[0];
        points[0] = Math.max(Math.max(fence[1][0], fence[1][2]), Math.max(points[0], points[2]));
        points[1] = Math.max(Math.max(fence[1][1], fence[1][3]), Math.max(fence[0][1], fence[0][3]));
        points[2] = Math.min(Math.min(fence[1][0], fence[1][2]), Math.min(fence[0][0], fence[0][2]));
        points[3] = Math.min(Math.min(fence[1][1], fence[1][3]), Math.min(fence[0][1], fence[0][3]));

        pw.println((int)Math.pow(Math.max((points[3]-points[2]), (points[1]-points[0])), 2));

        br.close();
        pw.close();
    }
}
