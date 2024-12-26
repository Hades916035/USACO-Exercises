public class Queue {
    private int[] arr;
    private String[] words;
    private int[] endPoints = {0,0};
    private int type=0;

    public Queue() {
        arr = new int[200000000];
        words = new String[200000000];
    }

    public void add(int i) {
        type=-1;
        arr[endPoints[1]] = i;

        endPoints[1]++;
    }
    
    public void add(String i) {
        type=1;
        words[endPoints[1]] = i;
    }

    public void remove() {
        if(endPoints[0] < endPoints[1])
            endPoints[0]++;
    }

    public int peek() {
        return arr[endPoints[1]-1];
    }

    public String top() {
        return words[endPoints[1]-1];

    }

    public void printQueue() {
        if(type==-1) {
            System.out.println("Queue: ");
            for(int j=endPoints[0]; j<endPoints[1]; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        } else if(type==1) {
            System.out.println("Queue: ");
            for(int j=endPoints[0]; j<endPoints[1]; j++) {
                System.out.print(words[j] + " ");
            }
            System.out.println();
        }
    }
}
