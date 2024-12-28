import java.io.*;
import java.util.*;

public class SocialDistancing {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(new File("socdist.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("socdist.out"));
        
        int n = kb.nextInt();
        int m = kb.nextInt();
        
        long[][] intervals = new long[m][2];
        for(int i = 0; i < m; i++) {
            intervals[i][0] = kb.nextLong();
            intervals[i][1] = kb.nextLong();
        }
        
        Arrays.sort(intervals, (a, b) -> Long.compare(a[0], b[0]));
        
        long left = 1;
        long right = intervals[m-1][1] - intervals[0][0];
        long result = -1;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canPlaceCows(n, intervals, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        pw.println(result);
        kb.close();
        pw.close();
    }
    
    private static boolean canPlaceCows(int n, long[][] intervals, long dist) {
        int count = 1;
        long lastPos = intervals[0][0];
        int currInterval = 0;
        
        while (count < n && currInterval < intervals.length) {
            long nextPos = lastPos + dist;
            
            while (currInterval < intervals.length && intervals[currInterval][1] < nextPos) {
                currInterval++;
            }
            
            if (currInterval == intervals.length) break;
            
            if (nextPos < intervals[currInterval][0]) {
                lastPos = intervals[currInterval][0];
            } else {
                lastPos = nextPos;
            }
            
            count++;
        }
        
        return count >= n;
    }
}