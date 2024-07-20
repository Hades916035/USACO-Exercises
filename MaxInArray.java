public class MaxInArray {
    public static void main(String[] args) {
        int arr[][] = {{5, 10, 12, 1}, {7, 14, 9, 0}, {13, 7, 9, 45}};
        int max = arr[0][0];
        int maxInd[] = {0, 0};
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(max<arr[i][j]) {
                    max = arr[i][j];
                    maxInd[0] = j;
                    maxInd[1] = i;
                }
            }
        }
        System.out.println(max + " at (" + maxInd[0] + ", " + maxInd[1] + ")");
    }
}