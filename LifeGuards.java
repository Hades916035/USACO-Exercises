import java.io.*;
import java.util.*;

public class LifeGuards {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("lifeguards.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("lifeguards.out")));

        int n = Integer.parseInt(br.readLine());
        int[][] shifts = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            shifts[i][0] = Integer.parseInt(line[0]);
            shifts[i][1] = Integer.parseInt(line[1]);
        }

        int maxNum = 0;

        for (int i = 0; i < n; i++) {
            boolean[] time = new boolean[1000];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int t = shifts[j][0]; t < shifts[j][1]; t++) {
                    if (!time[t]) {
                        time[t] = true;
                        count++;
                    }
                }
            }
            maxNum = Math.max(maxNum, count);
        }
        pw.println(maxNum);

        br.close();
        pw.close();
    }
}

/*import java.io.*;
import java.util.*;

public class LifeGuards {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("lifeguards.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("lifeguards.out")));

        int max = 0;
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][2];
        for(int i=0; i<n; i++) {
            String[] x = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(x[0]);
            arr[i][1] = Integer.parseInt(x[1]);
            max = Math.max(max, arr[i][1]);
        }

        boolean[] time = new boolean[max];
        int maxNum = 0;
        for(int i=0; i<n; i++) {
            Arrays.fill(time, true);
            int count=0;
            for(int j=0; j<max; j++) {
                if(i==j) continue;
                for(int k=arr[j][0]; k<arr[j][1]; k++) {
                    if(time[k]) {
                        time[k] = false;
                        count++;
                    }
                }
            }
            maxNum = Math.max(maxNum, count);
        }

        pw.println(maxNum);

        br.close();
        pw.close();
    }
} */