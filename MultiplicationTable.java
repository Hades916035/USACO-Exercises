import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int arr[] = table(num);
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
}
