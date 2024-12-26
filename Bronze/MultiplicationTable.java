import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int arr[] = table(num);

        kb.close();
    }

    public static int[] table(int num) {
        int arr[] = new int[10];
        arr[0] = num;
        System.out.print("\n" + num);
        for(int i=1; i<10; i++) {
            arr[i] = arr[i-1] + num;
            System.out.print(" " + arr[i]);
        }


        System.out.println();
        return arr;
    }

    public static int[][] multiplicationTable(int size) {
        int table[][] = new int[size][size];
        for(int i=size; i>0; i--) {
            int arr[] = new int[size];
            arr[0] = i;
            for(int j=1; j<size; j++) {
                arr[j] = arr[j-1] + i;
            }
            table[i-1] = arr;
        }
        return table;
    }
}