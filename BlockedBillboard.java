import java.io.*;

public class BlockedBillboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));

        int[][] arr = new int[2][4];
        for (int i = 0; i < 2; i++) {
            String[] x = br.readLine().split(" ");
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(x[j]);
            }
        }

        int x1 = arr[0][0];
        int y1 = arr[0][1];
        int x2 = arr[0][2];
        int y2 = arr[0][3];

        int x3 = arr[1][0];
        int y3 = arr[1][1];
        int x4 = arr[1][2];
        int y4 = arr[1][3];

        int totalArea = (x2 - x1) * (y2 - y1);

        int overlapX1 = Math.max(x1, x3);
        int overlapY1 = Math.max(y1, y3);
        int overlapX2 = Math.min(x2, x4);
        int overlapY2 = Math.min(y2, y4);

        int overlapArea = 0;
        if (overlapX1 < overlapX2 && overlapY1 < overlapY2) {
            overlapArea = (overlapX2 - overlapX1) * (overlapY2 - overlapY1);
        }

        int tarpArea = totalArea;

        pw.println(tarpArea);
        br.close();
        pw.close();
    }
}

/*import java.io.*;
import java.util.*;

public class BlockedBillboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));

        int[][] arr = new int[2][4];
        for(int i=0; i<2; i++) {
            String[] x = br.readLine().split(" ");
            for(int j=0; j<4; j++) {
                arr[i][j] = Integer.parseInt(x);
            }
        }

        

        br.close();
        pw.close();
    }
}
*/