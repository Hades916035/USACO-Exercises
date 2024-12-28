import java.io.*;
import java.util.*;

public class CowDanceShow {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(new File("cowdance.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("cowdance.out"));

        int n = kb.nextInt();
        int t = kb.nextInt();

        int sum = 0;
        int[] cows = new int[n];
        for(int i=0; i<n; i++) {
            cows[i] = kb.nextInt();
            sum += cows[i];
        }

        if(sum<t) {
            pw.println(1);
            System.exit(0);
        } else {
            int left = 1;
            int right = n;
            int ans = n;
            
            while (left <= right) {
                int mid = (left + right) / 2;
                if (canFinishInTime(cows, mid, t)) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            pw.println(ans);
        }

        kb.close();
        pw.close();
    }
    
    private static boolean canFinishInTime(int[] cows, int k, int maxTime) {
        PriorityQueue<Integer> stage = new PriorityQueue<>();
        int currentTime = 0;
        int cowIndex = 0;
        
        for (int i = 0; i < k && i < cows.length; i++) {
            stage.add(cows[i]);
            cowIndex++;
        }
        
        while (!stage.isEmpty()) {
            currentTime = stage.poll();
            if (currentTime > maxTime) return false;
            
            if (cowIndex < cows.length) {
                stage.add(currentTime + cows[cowIndex]);
                cowIndex++;
            }
        }
        
        return currentTime <= maxTime;
    }
}