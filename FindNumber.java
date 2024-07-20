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
    }
}