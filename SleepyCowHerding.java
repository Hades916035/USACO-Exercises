import java.io.*;
import java.util.*;

public class SleepyCowHerding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("herding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("herding.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] positions = new int[3];
        for (int i = 0; i < 3; i++) {
            positions[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(positions);
        int x1 = positions[0], x2 = positions[1], x3 = positions[2];

        int gap1 = x2 - x1 - 1;
        int gap2 = x3 - x2 - 1;

        int minMoves;
        if (gap1 == 1 || gap2 == 1) {
            minMoves = 1;
        } else {
            minMoves = 2;
        }

        int maxMoves = (x3 - x1 - 2);

        pw.println(minMoves);
        pw.println(maxMoves);
        pw.close();
    }
}