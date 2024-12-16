import java.io.*;
import java.util.*;

public class Photoshoot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("photo.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("photo.out")));

        int n = Integer.parseInt(br.readLine());
        String[] x = br.readLine().split(" ");
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = Integer.parseInt(x[i]);
        }

        int[] result = find(n, b);

        for (int i = 0; i < n; i++) {
            pw.print(result[i]);
            if (i < n - 1) 
                pw.print(" ");
        }
        pw.println();

        br.close();
        pw.close();
    }

    public static int[] find(int n, int[] b) {
        for (int a1 = 1; a1 <= n; a1++) {
            int[] a = new int[n];
            boolean[] used = new boolean[n + 1];
            a[0] = a1;
            used[a1] = true;

            boolean valid = true;
            for (int i = 1; i < n; i++) {
                a[i] = b[i - 1] - a[i - 1];
                if (a[i] < 1 || a[i] > n || used[a[i]]) {
                    valid = false;
                    break;
                }
                used[a[i]] = true;
            }

            if (valid) {
                return a;
            }
        }
        return null;
    }
}

/* import java.io.*;
import java.util.*;

public class Photoshoot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("photo.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("photo.out")));

        int n = Integer.parseInt(br.readLine());
        String x[] = br.readLine().split(" ");
        int[] arr = new int[n-1];
        for(int i=0; i<n-1; i++) {
            arr[i] = Integer.parseInt(x[i]);
        }

        pw.println(find(arr));

        br.close();
        pw.close();
    }

    public static int[] find(int[] arr) {
        for(int i=0; i<=arr[0]; i++) {
            boolean keepgoing = true;
            int[] result = new int[arr.length + 1];
            Arrays.fill(result, -1);
            result[0] = i;
            for(int j=1; j<arr.length && keepgoing; j++) {
                if(arr[j] - result[j-1] < 0)
                    keepgoing = false;
                else
                    result[j] = arr[j] - result[j-1];
            }
            if(result[result.length-1] != -1)
                return result;
        }
        return null;
    }
}
*/