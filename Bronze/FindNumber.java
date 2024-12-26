/* public class FindNumber {
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 11, 15, 16, 20, 21, 22};

    }

    public static int reduce(int[] arr, int target, int start) {
        int num = (int)(arr.length / 2);
        if(arr[num] == target) {
            return start + (int)(arr.length / 2);
        } else if(arr[num] > target) {
            return reduce(changeArr[], target, (int)(arr.length / 2));
        }
    }

    public static int[] changeArr(int arr[], int start, int end) {
        int newArr[] = new int[end-start];
        for(int i=0; i<=end-start; i++) {
            newArr = arr[start + i];
        }
        return newArr;
    }
} */

/* 
import java.util.*;

public class FindNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int target = kb.nextInt();
        int arr[] = {2, 5, 9, 11, 15, 16, 20, 21, 22};
        for(int i=0; i<arr.length; i++) {
            if(target == arr[i]) {
                System.out.println(i);
            }
        }

        kb.close();
    }
}
*/

public class FindNumber {
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 11, 15, 16, 20, 21, 22};
        find(arr);
    }

    public static int find(int arr[]) {
        int start = 0;
        int end = arr.length;
        while(end-start != 1) {
            int num = arr[(int)((end-start / 2) + start)];
            if(num == target) {
                return (int)((end-start / 2) + start);
            } else if(num > target) {

            }
        }
    }
}