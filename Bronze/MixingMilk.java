import java.util.*;
import java.io.*;

public class MixingMilk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("mixmilk.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));

        int[][] arr = new int[3][2];
        for(int i=0; i<3; i++) {
            String[] x = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(x[0]);
            arr[i][1] = Integer.parseInt(x[1]);
        }

        for(int i=1; i<=100; i++) {
            if(i%3 == 1) {
                if(arr[0][1] + arr[1][1] <= arr[1][0]) {
                    arr[1][1] = arr[0][1] + arr[1][1];
                    arr[0][1] = 0;
                } else {
                    arr[0][1] = arr[0][1] + arr[1][1] - arr[1][0];
                    arr[1][1] = arr[1][0];
                }
            } else if(i%3 == 2) {
                if(arr[2][1] + arr[1][1] <= arr[2][0]) {
                    arr[2][1] = arr[1][1] + arr[2][1];
                    arr[1][1] = 0;
                } else {
                    arr[1][1] = arr[1][1] + arr[2][1] - arr[2][0];
                    arr[2][1] = arr[2][0];
                } 
            } else {
                if(arr[2][1] + arr[0][1] <= arr[0][0]) {
                    arr[0][1] = arr[2][1] + arr[0][1];
                    arr[2][1] = 0;
                } else {
                    arr[2][1] = arr[2][1] + arr[0][1] - arr[0][0];
                    arr[0][1] = arr[0][0];
                } 
            }
        }

        pw.print(arr[0][1] + "\n" + arr[1][1] + "\n" + arr[2][1]);

        br.close();
        pw.close();
    }
}
