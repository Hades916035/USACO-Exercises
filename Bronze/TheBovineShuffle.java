import java.io.*;
import java.util.*;

public class TheBovineShuffle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("shuffle.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
        
        int N = Integer.parseInt(br.readLine());
        int[] shuffleMapping = new int[N];
        String[] shuffleLine = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            shuffleMapping[i] = Integer.parseInt(shuffleLine[i]) - 1;
        }

        int[] finalOrder = new int[N];
        String[] cowIDs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            finalOrder[i] = Integer.parseInt(cowIDs[i]);
        }

        int[] currentOrder = new int[N];
        System.arraycopy(finalOrder, 0, currentOrder, 0, N);

        for (int shuffleCount = 0; shuffleCount < 3; shuffleCount++) {
            int[] nextOrder = new int[N];
            for (int i = 0; i < N; i++) {
                nextOrder[shuffleMapping[i]] = currentOrder[i];
            }
            currentOrder = nextOrder;
        }

        for (int i = 0; i < N; i++) {
            pw.println(currentOrder[i]);
        }

        br.close();
        pw.close();
    }
}