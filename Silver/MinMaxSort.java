import java.util.*;

public class MinMaxSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            System.out.println(solve(p));
        }
        sc.close();
    }
    
    private static int solve(int[] p) {
        int n = p.length;
        if (n <= 1) return 0;
        
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (p[i] < p[i-1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;
        
        int operations = 0;
        for (int i = 0; i < n-1; i += 2) {
            int min = Math.min(p[i], i + 1 < n ? p[i+1] : Integer.MAX_VALUE);
            int max = Math.max(p[i], i + 1 < n ? p[i+1] : Integer.MIN_VALUE);
            
            if (i > 0 && min < p[i-1]) {
                operations++;
            }
            
            if (i + 1 < n && p[i] > p[i+1]) {
                operations++;
            }
        }
        
        return operations;
    }
}
