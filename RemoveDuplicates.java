public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int x = 0;
        for ( int i = 1; i < nums.length; i++){
            if ( nums[i] != nums[x] )
                nums[++x] = nums[i];
        }
        return x+1;
    }
}
