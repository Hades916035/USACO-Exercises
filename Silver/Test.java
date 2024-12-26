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

        Queue q = new Queue();
        q.add(1);
        q.printQueue();
        q.add(2);
        q.printQueue();
        System.out.println(q.peek());
        q.printQueue();
        q.remove();
        q.printQueue();
        System.out.println(q.peek());
        q.printQueue();
        q.remove();
        q.printQueue();
        q.remove();
        q.printQueue();
        q.add(1);
        q.printQueue();
    }
}
