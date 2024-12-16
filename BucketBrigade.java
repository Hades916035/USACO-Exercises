import java.io.*;
import java.util.*;

public class BucketBrigade {
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("buckets.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("buckets.out")));

        char[][] grid = new char[10][10];
        int barnX = 0, barnY = 0, lakeX = 0, lakeY = 0;

        for (int i = 0; i < 10; i++) {
            String line = br.readLine();
            grid[i] = line.toCharArray();
            for (int j = 0; j < 10; j++) {
                if (grid[i][j] == 'B') {
                    barnX = i;
                    barnY = j;
                } else if (grid[i][j] == 'L') {
                    lakeX = i;
                    lakeY = j;
                }
            }
        }

        int result = bfs(grid, lakeX, lakeY, barnX, barnY);

        pw.println(result);
        pw.close();
    }

    private static int bfs(char[][] grid, int startX, int startY, int targetX, int targetY) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[10][10];
        queue.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int steps = current[2];

            if (x == targetX && y == targetY) {
                return steps - 1;
            }

            for (int[] dir : DIRECTIONS) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < 10 && newY >= 0 && newY < 10 &&
                    !visited[newX][newY] && grid[newX][newY] != 'R') {
                    visited[newX][newY] = true;
                    queue.add(new int[]{newX, newY, steps + 1});
                }
            }
        }

        return -1;
    }
}