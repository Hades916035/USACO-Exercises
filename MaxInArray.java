public class MaxInArray {
    public static void main(String[] args) {
        int arr[][] = {{5, 10, 12, 1}, {7, 14, 9, 0}, {13, 7, 99, 45}};
        int max = arr[0][0];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max);
    }
}