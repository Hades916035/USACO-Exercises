import java.util.*;

public class ComputeMode {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 3};
        System.out.println(mode(arr));
    }

    public static int mode(int[] arr) {
        HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
        for(int num : arr) {
            if(nums.containsKey(num)) {
                nums.replace(num, nums.get(num) + 1);
            } else {
                nums.put(num, 1);
            }
        }
        int max = nums.get(arr[0]);
        for(int num : arr) {
            max = Math.max(nums.get(num), max);
        }
        for(int num : arr) {
            if(max == nums.get(num)) {
                return num;
            }
        }
        return 0;
    }
}
