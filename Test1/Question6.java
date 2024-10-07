import java.util.*;

public class Question6{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,5,4,6,2,7};
        ArrayList<Integer> nums=new ArrayList<Integer>();
        for(int i:arr){
            if(!(nums.contains(i)))
                nums.add(i);
        }
        int result[]=new int[nums.size()];
        for(int i=0; i<nums.size();i++){
            result[i]=nums.get(i);
        }

        for(int i : result) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}