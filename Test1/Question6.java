import java.util.*;

public class Question6{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,5,4,6,2,7};
        ArrayList<Integer> nums=new ArrayList<Integet>();
        for(int i:arr){
            if(!(nums.contains(i)))
                nums.add(i);
        }
        int result[]=new int[nums.length()];
        for(int i=0; i<nums.length();i++){
            result[i]=nums.get(i);
        }
        System.out.println(result);
    }
}