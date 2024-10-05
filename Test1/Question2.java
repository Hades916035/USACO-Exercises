import java.util.*;

public class Question2{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,5,6,7};
        HashMap<Integer, Integer> idfk = new HashMap<Integer, Integer>();
        for(int i: arr){
            if(idfk.containsKey(i)){
                idfk.replace(i, idfk.get(i)+1);
            } else{
                idfk.put(i, 1);
            }
           
        }
        System.out.print(idfk);
    }
}
