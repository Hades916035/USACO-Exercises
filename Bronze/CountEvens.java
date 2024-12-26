public class CountEvens {
    public static int even(int[] arr) {
        int evens = 0;
        for(int i : arr) {
            if(i%2 == 0) {
                evens++;
            }
        }
        return evens;
    }
}
