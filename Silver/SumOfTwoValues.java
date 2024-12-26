import java.util.*;

public class SumOfTwoValues {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int target = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);

        int[] points = {0, arr.length-1};
        boolean done = false;
        while(points[0] < points[1]) {
            if(arr[0] <= target) {
                break;
            }
            int num = arr[points[0]] + arr[points[1]];
            if(num == target) {
                System.out.println(points[0]+1 + " " + points[1]+1);
                done = true;
                break;
            } else if(num > target) {
                points[1]--;
            } else {
                points[0]++;
            }
        }

        if(!done) {
            System.out.println("IMPOSSIBLE");
        }

        kb.close();
    }
}
