import java.io.*;

public class SpeedingTicket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

        String[] x = br.readLine().split(" ");
        int N = Integer.parseInt(x[0]);
        int M = Integer.parseInt(x[1]);

        // Read road segments
        int[][] road = new int[N][2];
        for (int i = 0; i < N; i++) {
            x = br.readLine().split(" ");
            road[i][0] = Integer.parseInt(x[0]); // Length of the segment
            road[i][1] = Integer.parseInt(x[1]); // Speed limit
        }

        // Read Bessie's journey
        int[][] bessie = new int[M][2];
        for (int i = 0; i < M; i++) {
            x = br.readLine().split(" ");
            bessie[i][0] = Integer.parseInt(x[0]); // Length of the segment
            bessie[i][1] = Integer.parseInt(x[1]); // Speed
        }

        // Compare segments
        int roadIndex = 0, bessieIndex = 0;
        int roadPos = 0, bessiePos = 0; // Positions in the road and journey
        int maxSpeeding = 0;

        while (roadIndex < N && bessieIndex < M) {
            int roadLimit = road[roadIndex][1];
            int bessieSpeed = bessie[bessieIndex][1];

            // Overlapping length
            int overlap = Math.min(road[roadIndex][0] - roadPos, bessie[bessieIndex][0] - bessiePos);

            // Calculate speeding
            if (bessieSpeed > roadLimit) {
                maxSpeeding = Math.max(maxSpeeding, bessieSpeed - roadLimit);
            }

            // Update positions
            roadPos += overlap;
            bessiePos += overlap;

            // Move to the next segment if we have reached the end of the current one
            if (roadPos == road[roadIndex][0]) {
                roadIndex++;
                roadPos = 0;
            }
            if (bessiePos == bessie[bessieIndex][0]) {
                bessieIndex++;
                bessiePos = 0;
            }
        }

        pw.println(maxSpeeding);

        br.close();
        pw.close();
    }
}


/*import java.io.*;

public class SpeedingTicket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

        String[] x = br.readLine().split(" ");
        int[][] road = new int[Integer.parseInt(x[0])][2];
        int[][] bessie = new int[Integer.parseInt(x[1])][2];

        for(int i=0; i<road.length; i++) {
            x = br.readLine().split(" ");
            road[i][1] = Integer.parseInt(x[1]);
            if(i>0) {
                road[i][0] += Integer.parseInt(x[0]);
            } else {
                road[i][0] = Integer.parseInt(x[0]);
            }
        }
        for(int i=0; i<bessie.length; i++) {
            x = br.readLine().split(" ");
            bessie[i][1] = Integer.parseInt(x[1]);
            if(i>0) {
                bessie[i][0] += Integer.parseInt(x[0]);
            } else {
                bessie[i][0] = Integer.parseInt(x[0]);
            }
        }

        int speeding = 0;
        int prev = 0;
        for(int[] a : road) {
            for(int[] b : bessie) {
                if(a[0]>=b[0] && prev<b[0]) {
                    speeding = Math.max(b[1]-a[1], speeding);
                }
            }
            prev = a[0];
        }

        // for(int[] a : road) {
        //     for(int b : a) {
        //         pw.print(b + " ");
        //     }
        //     pw.println();
        // }

        // for(int[] a : bessie) {
        //     for(int b : a) {
        //         pw.print(b + " ");
        //     }
        //     pw.println();
        // }

        pw.println(speeding);

        br.close();
        pw.close();
    }
}
*/