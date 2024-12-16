//LANG: Java
import java.util.*;
public class PermutationsPriyanshu{
    public static void perm(ArrayList<Integer> arr, ArrayList<Integer> current) {
        if (arr.size() == 0) {
            System.out.println(current);
        } else {
            for (int i = 0; i < arr.size(); i++) {
                int num = arr.get(i);
                ArrayList<Integer> remaining = new ArrayList<>(arr);
                remaining.remove(i);
                ArrayList<Integer> nextCurrent = new ArrayList<>(current);
                nextCurrent.add(num);
                perm(remaining, nextCurrent);
            }
        }
    }
    public static void printThePerm(int[] arr){
        ArrayList<Integer> idk = new ArrayList<Integer>();
        for(int a:arr){
            idk.add(a);
        }
        perm(idk, new ArrayList<>());
    }
    public static int countPerm(int[] arr){
        int sum=1; int vals=arr.length;
        while(vals>1){
            sum*=vals;
            vals--;
        }
        return sum;}
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        printThePerm(arr);
        System.out.println("There are " + countPerm(arr) + " permutations.");
    }
}