import java.util.*;

public class YunlisSubarrayQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt() - 1;  
                int r = sc.nextInt() - 1;
                
                int moves = 0;
                for (int j = l; j < r; j++) {
                    if (a[j + 1] != a[j] + 1) {
                        moves++;
                    }
                }
                System.out.println(moves);
            }
        }
        
        sc.close();
    }
}