import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int q = kb.nextInt();

        int[][] xy = new int[n][n];
        int[][] yz = new int[n][n];
        int[][] xz = new int[n][n];

        int check = 0;
        for(int i=0; i<q; i++) {
            int[] coordinates = {kb.nextInt(), kb.nextInt(), kb.nextInt()};
            xy[coordinates[0]][coordinates[1]] += 1;
            if(xy[coordinates[0]][coordinates[1]] == n) {
                check++;
                xy[coordinates[0]][coordinates[1]] = -1;
            }
            yz[coordinates[1]][coordinates[2]] += 1;
            if(yz[coordinates[1]][coordinates[2]] == n) {
                check++;
                yz[coordinates[1]][coordinates[2]] = -1;
            }
            xz[coordinates[0]][coordinates[2]] += 1;
            if(xz[coordinates[0]][coordinates[2]] == n) {
                check++;
                xz[coordinates[0]][coordinates[2]] = -1;
            }

            System.out.println(check);
        }

        kb.close();
    }
}