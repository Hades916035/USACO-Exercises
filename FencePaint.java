import java.io.*;
import java.util.*;

public class FencePaint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));

        String[] x = br.readLine().split(" ");
        int[] arr = new int[4];
        arr[0] = Integer.parseInt(x[0]); arr[1] = Integer.parseInt(x[1]);
        x = br.readLine().split(" ");
        arr[2] = Integer.parseInt(x[0]); arr[3] = Integer.parseInt(x[1]);

        int length;
        if(arr[1] >= arr[2]) {
            arr[0] = Math.min(arr[0], arr[2]);
            arr[1] = Math.max(arr[1], arr[3]);
            length = arr[1]-arr[0];
        } else {
            length = arr[1]-arr[0] + arr[3]-arr[2];
        }

        pw.println(length);

        br.close();
        pw.close();
    }
}
