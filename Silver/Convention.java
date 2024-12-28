import java.util.*;
import java.io.*;

public class Convention {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(new File("convention.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("convention.out"));

        int n = kb.nextInt();
        int m = kb.nextInt();
        int c = kb.nextInt();

        int[] cows = new int[n];
        for(int i=0; i<n; i++) {
            cows[i] = kb.nextInt();
        }
        Arrays.sort(cows);

        long left = 0;
        long right = cows[cows.length-1];
        while (left < right) {
            long mid = left + (right-left)/2;
            if (possible(cows, m, c, mid)) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        
        pw.println(left);
        
        kb.close();
        pw.close();
    }

    private static boolean possible(int[] cows, int m, int c, long maxWait) {
        int buses = 1;
        int firstCow = cows[0];
        int cowsInBus = 1;
        
        for (int i=1; i<cows.length; i++) {
            if (cows[i]-firstCow > maxWait || cowsInBus==c) {
                buses++;
                firstCow = cows[i];
                cowsInBus = 1;
            } else {
                cowsInBus++;
            }
        }
        
        return buses <= m;
    }
}