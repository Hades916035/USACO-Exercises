import java.util.*;
public class Question5{
    public static void main(String[] args){
        int arra[]={1,2,5,6,8,9};
        int arrb[]={3,4,5,6,7,8,11};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int a: arra){
            for(int b: arrb){
                if(a==b)
                    arr.add(a);
            }
        }
        int result[]=new int[arr.size()];
            int i=0;
            for(int a: arr){
                result[i]=a;
                i++;
            }
            for(int x : result) {
                System.out.print(x + " ");
            }
    
            System.out.println();
    }
}

