import java.util.*;

public class Stack {
    private int[] arr;
    private String[] words;
    private int type=0;
    private int last = 0;

    public Stack() {
        arr = new int[200000000];
        words = new String[200000000];
    }

    public void pop() {
        if (last > 0) {
            last--;
        }

        if(type==-1) {
            System.out.println("Stack: ");
            for(int i=last-1; i>=0; i--) {
                System.out.println(arr[i]);
            }
            System.out.println();
        } else if(type==-1) {
            System.out.println("Stack: ");
            for(int i=last-1; i>=0; i--) {
                System.out.println(words[i]);
            }
            System.out.println();
        }
    }

    public void push(int i) {
        type=-1;
        arr[last] = i;
        last++;

        System.out.println("Stack: ");
        for(int j=last-1; j>=0; j--) {
            System.out.println(arr[j]);
        }
        System.out.println();
    }

    public void push(String i) {
        type=1;
        words[last] = i;
        last++;

        System.out.println("Stack: ");
        for(int j=last-1; j>=0; j--) {
            System.out.println(words[j]);
        }
        System.out.println();
    }

    public int peek() {
        System.out.println(arr[last-1]);

        System.out.println("Stack: ");
        for(int i=last-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println();

        return arr[last-1];
    }

    public String top() {
        System.out.println(words[last-1]);

        System.out.println("Stack: ");
        for(int i=last-1; i>=0; i--) {
            System.out.println(words[i]);
        }
        System.out.println();

        return words[last-1];
    }

    public boolean isEmpty() {
        System.out.println("Stack: ");
        for(int i=last-1; i>=0; i--) {
            System.out.println(words[i]);
        }
        System.out.println();

        if(last == 0) {
            return true;
        } else {
            return false;
        }
    }
}