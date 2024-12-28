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

        AdjacencyMatrix am = new AdjacencyMatrix(5, false);
        am.addEdge(0, 3);
        am.addEdge(3, 2);
        am.addEdge(0, 2);
        am.removeEdge(0, 3);
        am.addEdge(4, 3);
        am.addEdge(0, 1);
        am.addEdge(1, 3);
        am.removeEdge(0, 1);
        // for(int i : am.getNeighbors(0)) {
        //     System.out.print(i);
        // }
        am.printNeighbors(0);

        System.out.println("\n");

        am.print();
    }
}
