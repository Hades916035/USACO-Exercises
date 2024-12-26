import java.io.*;
import java.util.*;

public class DiamondCollector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("diamond.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("diamond.out"));
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        
        int[] rocks = new int[n];
        for (int i=0; i<n; i++) {
            rocks[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rocks);
        
        int[] maxArr = new int[n];
        for (int i=0; i < n; i++) {
            int j = i;
            while (j<n && rocks[j]-rocks[i]<=k) {
                j++;
            }
            maxArr[i] = j-i;
        }
        
        int max = 0;
        for (int i=0; i<n; i++) {
            int case1 = maxArr[i];
            
            int case2 = 0;
            for (int j=i+maxArr[i]; j<n; j++) {
                case2 = Math.max(case2, maxArr[j]);
            }
            
            max = Math.max(max, case1+case2);
        }
        
        pw.println(max);
        pw.close();
        br.close();
    }
}
