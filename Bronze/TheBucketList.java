import java.io.*;
import java.util.*;

public class TheBucketList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("blist.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            String[] y = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(y[0]);
            arr[i][1] = Integer.parseInt(y[1]);
            arr[i][2] = Integer.parseInt(y[2]);
        }

        int[] bucketUsage = new int[1001];

        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            int buckets = arr[i][2];
            for (int t = start; t <= end; t++) {
                bucketUsage[t] += buckets;
            }
        }

        int maxBuckets = 0;
        for (int i = 0; i <= 1000; i++) {
            maxBuckets = Math.max(maxBuckets, bucketUsage[i]);
        }

        pw.println(maxBuckets);
        pw.close();
        br.close();
    }
}