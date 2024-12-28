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
        String s = "";
        for(int i=0; i<matrix[v].length; i++) {
            if(matrix[v][i] == 1) {
                s += i + " ";
            }
        }
        String[] ans = s.split(" ");
        int[] result = new int[ans.length];
        for(int i=0; i<ans.length; i++) {
            result[i] = Integer.parseInt(ans[i]);
        }

        return result;
    }

    public void printNeighbors(int v) {
        for(int i : getNeighbors(0)) {
            System.out.print(i + " ");
        }
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