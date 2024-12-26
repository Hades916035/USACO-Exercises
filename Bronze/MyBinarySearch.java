public class MyBinarySearch {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x=7;
        int[] vals={0, arr.length - 1};
        boolean found = false;
        int num;
        while(!found){
            num = (int) ((vals[1] + vals[0])/2);
            if(arr[num] == x){
                System.out.println("Index of " + x + " is " + num);
                found = true;
            }else if(arr[num]>x)
                vals[1] = num;
            else
                vals[0] = num;
        }        
    }
}