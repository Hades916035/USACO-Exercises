import java.util.*;
import java.io.*;

public class Teleportation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("teleport.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));

        String[] x = br.readLine().split(" ");
        int[] arr = new int[4];

        for(int i=0; i<4; i++) {
            arr[i] = Integer.parseInt(x[i]);
        }

        int distance = Math.abs(arr[0] - arr[1]);

        distance = Math.min(distance, Math.abs(arr[0]-arr[2]) + Math.abs(arr[1]-arr[3]));

        distance = Math.min(distance, Math.abs(arr[1]-arr[2]) + Math.abs(arr[0]-arr[3]));

        pw.print(distance);

        br.close();
        pw.close();
    }
}
