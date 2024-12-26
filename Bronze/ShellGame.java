import java.io.*;
import java.util.*;

public class ShellGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));

        int n = Integer.parseInt(br.readLine());

        int[][] moves = new int[n][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            moves[i][0] = Integer.parseInt(st.nextToken()); 
            moves[i][1] = Integer.parseInt(st.nextToken()); 
            moves[i][2] = Integer.parseInt(st.nextToken()); 
        }

        int maxScore = 0;
        for (int start = 1; start <= 3; start++) {
            maxScore = Math.max(maxScore, simulateGame(start, moves));
        }

        pw.println(maxScore);
        pw.close();
    }

    private static int simulateGame(int start, int[][] moves) {
        int pebble = start;
        int score = 0;

        for (int[] move : moves) {
            int a = move[0], b = move[1], g = move[2];

            if (pebble == a) {
                pebble = b;
            } else if (pebble == b) {
                pebble = a;
            }

            if (pebble == g) {
                score++;
            }
        }

        return score;
    }
}