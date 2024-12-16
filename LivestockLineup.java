import java.io.*;
import java.util.*;

public class LivestockLineup {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("lineup.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("lineup.out")));

        int n = Integer.parseInt(br.readLine());
        int bea = 0;
        int sue = 0;
        String[] beaAppears = new String[8];
        Arrays.fill(beaAppears, "");
        String[] sueAppears = new String[8];
        Arrays.fill(sueAppears, "");
        String[][] x = new String[n][n];
        for(int i=0; i<n; i++) {
            String[] y = br.readLine().split(" must be milked beside ");
            x[i][0] = y[0];
            x[i][1] = y[1];
            if(y[0].equals("Beatrice")) {
                for(int j=0; j<8; j++) {
                    if(beaAppears[j] == "") {
                        beaAppears[j] = y[1];
                        bea++;
                        i=8;
                    }
                }
            } else if(y[1].equals("Beatrice")) {
                for(int j=0; j<8; j++) {
                    if(beaAppears[j] == "") {
                        beaAppears[j] = y[0];
                        bea++;
                        i=8;
                    }
                }
            } else if(y[0].equals("Sue")) {
                for(int j=0; j<8; j++) {
                    if(sueAppears[j] == "") {
                        sueAppears[j] = y[1];
                        sue++;
                        i=8;
                    }
                }
            } else if(y[1].equals("Sue")) {
                for(int j=0; j<8; j++) {
                    if(sueAppears[j] == "") {
                        sueAppears[j] = y[0];
                        sue++;
                        i=8;
                    }
                }
            }
        }

        String[] cows = new String[8];
        if(sue<2) {
            cows[7] = "Sue";
            if(sue == 1) {
                cows[6] = sueAppears[0];
            }
        } else if(sue == 3) {
            
        }
        if(bea<2) {
            cows[0] = "Beatrice";
            if(bea == 1) {
                cows[1] = beaAppears[0];
            }
        }

        br.close();
        pw.close();
    }
}


/*
Beatrice
Belinda
Bella
Bessie
Betsy
Blue
Buttercup
Sue
*/