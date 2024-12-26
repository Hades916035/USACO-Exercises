import java.io.*;
import java.util.*;

public class Gymnastics {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));

        String[] firstLine = br.readLine().split(" ");
        int K = Integer.parseInt(firstLine[0]);
        int N = Integer.parseInt(firstLine[1]);

        int[][] rankings = new int[K][N];

        for (int i = 0; i < K; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                rankings[i][j] = Integer.parseInt(line[j]);
            }
        }

        int consistentPairs = 0;

        for (int cow1 = 1; cow1 <= N; cow1++) {
            for (int cow2 = 1; cow2 <= N; cow2++) {
                if (cow1 == cow2) continue; 

                boolean isConsistent = true;

                for (int session = 0; session < K; session++) {
                    int posCow1 = -1, posCow2 = -1;

                    for (int rank = 0; rank < N; rank++) {
                        if (rankings[session][rank] == cow1) posCow1 = rank;
                        if (rankings[session][rank] == cow2) posCow2 = rank;
                    }

                    if (posCow1 > posCow2) {
                        isConsistent = false; 
                        break;
                    }
                }

                if (isConsistent) consistentPairs++;
            }
        }

        pw.println(consistentPairs);
        pw.close();
        br.close();
    }
}

/*import java.io.*;
import java.util.*;

public class CowGymnastics {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));

        String[] x = br.readLine().split(" ");
        int lines = Integer.parseInt(x[0]);
        int cows = Integer.parseInt(x[1]);
        int[][] arr = new int[lines][cows];

        for(int i=0; i<arr.length; i++) {
            x = br.readLine().split(" ");
            for(int j=0; j< arr[0].length; j++) {
                arr[i][j] = x[j];
            }
        }

        int[][] pairs = new int[sum(cows)][2];
        for()

        br.close();
        pw.close();
    }

    public static int sum(int a) {
        int sum=0;
        for(int i=a-1; i>0; i--) {
            sum += a;
        }
        return sum;
    }
}
*/