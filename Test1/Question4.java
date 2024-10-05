import java.util.*;
public class Question4{
    public static void main(String[] args){
        int arr[]={1,2,7,3,4,19,5,6,99,7};
        int sum[]=new int[arr.length];
        for(int i=1; i<arr.length; i++){
            sum[i]=arr[i-1] + arr[1];
        }
    }
}