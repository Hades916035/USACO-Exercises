import java.util.*;
import java.io.*;

public class AngryCows {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(new File("angry.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("angry.out"));

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] bales = new int[n];

        for(int i=0; i<n; i++) {
            bales[i] = kb.nextInt();
        }
        Arrays.sort(bales);

        long left = 1;
        long right = bales[bales.length - 1];

        while(left < right) {
            long mid = left + (right - left) / 2;
            if(possible(bales, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        pw.println(left);

        kb.close();
        pw.close();
    }

    public static boolean possible(int[] bales, int k, long maxRadius) {
        int cowsNeeded = 1;
        int currentPos = bales[0];
        int i = 0;
        
        while (i<bales.length) {
            int nextPos = currentPos + 2 * (int)maxRadius;
            
            while (i<bales.length && bales[i] <= nextPos) {
                i++;
            }
            
            if (i<bales.length) {
                cowsNeeded++;
                currentPos = bales[i];
            }
        }
        
        return cowsNeeded <= k;
    }
}