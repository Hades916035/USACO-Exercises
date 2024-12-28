public class Test {
    public static void main(String[] args) {
        // Stack s = new Stack();

        // s.push("s");
        // s.push("a");
        // s.pop();
        // s.top();
        // s.pop();
        // s.pop();
        // s.push("d");

        // System.out.println();

        // Queue q = new Queue();
        // q.add(1);
        // q.printQueue();
        // q.add(2);
        // q.printQueue();
        // System.out.println(q.peek());
        // q.printQueue();
        // q.remove();
        // q.printQueue();
        // System.out.println(q.peek());
        // q.printQueue();
        // q.remove();
        // q.printQueue();
        // q.remove();
        // q.printQueue();
        // q.add(1);
        // q.printQueue();

        // AdjacencyMatrix am = new AdjacencyMatrix(5, false);
        // am.addEdge(0, 3);
        // am.addEdge(3, 2);
        // am.addEdge(0, 2);
        // am.removeEdge(0, 3);
        // am.addEdge(4, 3);
        // am.addEdge(0, 1);
        // am.addEdge(1, 3);
        // // for(int i : am.getNeighbors(0)) {
        // //     System.out.print(i);
        // // }
        // am.printNeighbors(0);
        // System.out.println("\n");
        // am.print();

        // AdjacencyMatrix directed = new AdjacencyMatrix(9, true);
        AdjacencyMatrix nondirected = new AdjacencyMatrix(9, false);

        nondirected.addEdge(1, 2);
        nondirected.addEdge(1, 3);
        nondirected.addEdge(1, 4);
        nondirected.addEdge(2, 3);
        nondirected.addEdge(2, 6);
        nondirected.addEdge(3, 5);
        nondirected.addEdge(4, 5);
        nondirected.addEdge(4, 6);
        nondirected.addEdge(5, 6);
        nondirected.addEdge(5, 7);
        nondirected.addEdge(6, 7);
        nondirected.addEdge(6, 8);
        nondirected.addEdge(7, 8);
        nondirected.addEdge(8, 9);

        nondirected.printNeighbors(6);
    }
}
