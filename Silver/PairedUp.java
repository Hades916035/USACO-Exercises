import java.io.*;
import java.util.*;

public class PairedUp {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(new File("pairup.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("pairup.out"));

        int max = 0;

        int n = kb.nextInt();
        int[][] input = new int[n][2];
        int len = 0;
        for(int i=0; i<n; i++) {
            input[i][0] = kb.nextInt();
            input[i][1] = kb.nextInt();
            len += input[i][0];
        }

        int[] cows = new int[len];
        int num = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<input[i][0]; j++) {
                cows[num] = input[i][1];
                num++;
            }
        }

        Arrays.sort(cows);
        int pair[] = {0, cows.length-1};

        while(pair[0] < pair[1]) {
            max = Math.max(max, pair[0]+pair[1]);
            pair[0]++; pair[1]--;
        }

        pw.println(max);

        kb.close();
        pw.close();
    }
}
