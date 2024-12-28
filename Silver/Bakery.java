import java.util.*;
import java.io.*;

public class Bakery {
    static int N, X, Y;
    static int[] A, B, C;
    
    static boolean check(int w) {
        // 1 <= x <= X
        // 1 <= y <= Y
        // x + y = X + Y - w
        // x = X + Y - y - w
        int lx = Math.max(1, X - w);
        int hx = Math.min(X + Y - w - 1, X);
        
        for (int i = 0; i < N; i++) {
            int a = A[i], b = B[i], c = C[i];
            int d = X + Y - w;
            // a * x + b * y <= c
            // x + y = d = (X + Y - w)
            // -b * x - b * y <= -b * d
            // (a-b) * x <= c - b * d
            
            if (b - a > 0) {
                lx = Math.max(lx, (-c + b * d + (b - a - 1)) / (b - a));
            } else if (a - b > 0) {
                hx = Math.min(hx, (c - b * d) / (a - b));
            } else {
                if (a * d > c) {
                    return false;
                }
            }
        }
        return (lx <= hx);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        
        for (int tc = 0; tc < TC; tc++) {
            // Skip empty line
            if (tc > 0) {
                sc.nextLine();
            }
            
            // Read N, X, Y
            N = sc.nextInt();
            X = sc.nextInt();
            Y = sc.nextInt();
            
            // Initialize arrays
            A = new int[N];
            B = new int[N];
            C = new int[N];
            
            // Read A, B, C values
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
                C[i] = sc.nextInt();
            }
            
            // Binary search
            int lo = 0;
            int hi = X + Y - 2;
            
            while (hi > lo) {
                int mid = (lo + hi) / 2;
                if (check(mid)) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }
            
            System.out.println(lo);
        }
        
        sc.close();
    }
}

/*

import java.io.*;
import java.util.*;

public class Bakery {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        int testCases = kb.nextInt();

        for(int i=0; i<testCases; i++) {
            int n = kb.nextInt();
            long timeCookies = kb.nextLong();
            long timeMuffins = kb.nextLong();
            long[][] friends = new long[n][3];
            for(int j=0; j<n; j++) {
                friends[j][0] = kb.nextLong();
                friends[j][1] = kb.nextLong();
                friends[j][2] = kb.nextLong();
            }

            long left = 0;
            long right = 1_000_000_000L;
            while(left<right) {
                long mid = left + (right-left)/2;
                if(possible(friends, timeCookies, timeMuffins, mid)) {
                    right = mid;
                } else {
                    left = mid+1;
                }
            }

            System.out.println(left);
        }

        kb.close();
    }

    public static boolean possible(long[][] arr, long tc, long tm, long maxMoney) {
        for (long c = 0; c <= maxMoney; c++) {
            long m = maxMoney - c;
            long newTc = Math.max(1, tc - c);
            long newTm = Math.max(1, tm - m);
            
            boolean valid = true;
            for (long[] friend : arr) {
                if (friend[0] * newTc + friend[1] * newTm > friend[2]) {
                    valid = false;
                    break;
                }
            }
            if (valid) return true;
        }
        return false;
    }
}

*/