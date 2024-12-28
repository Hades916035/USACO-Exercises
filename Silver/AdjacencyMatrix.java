import java.util.*;

public class AdjacencyMatrix {
    private int[][] matrix;
    private boolean directed;

    public AdjacencyMatrix(int n, boolean directed) {
        matrix = new int[n][n];
        this.directed = directed;
    }

    public void addEdge(int v1, int v2) {
        matrix[v1][v2] = 1;
        if (!directed) {
            matrix[v2][v1] = 1;
        }
    }

    public void removeEdge(int v1, int v2) {
        matrix[v1][v2] = 0;
        if (!directed) {
            matrix[v2][v1] = 0;
        }
    }

    public int[] getNeighbors(int v) {
        return matrix[v];
    }

    public void print() {
        for (int[] row : matrix) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}