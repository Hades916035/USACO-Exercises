import java.util.*;

public class ListExercises {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 4, 5};
        int b[] = {1, 2, 2, 3, 3, 4, 5, 6, 7, 7};
        int c[] = {4, 5, 6, 7, 7, 8, 9, 100, 6};
        int d[] = {1, 2, 3};
        int e[] = {2,6, 5};
        int f[] = {2, 7};
        uniqueElement(a);
        union(b, c);
        intersection(b, c);
        System.out.println(Arrays.toString(intersection(d, intersection(e, f))));
    }

    public static void uniqueElement(int[] a) {
        HashSet<Integer> nums = new HashSet<Integer>();
        for(int b : a)
            nums.add(b);
        System.out.println(nums);

        HashMap<Integer, Integer> howMany = new HashMap<Integer, Integer>();
        for(int b : a) {
            if(howMany.containsKey(b))
                howMany.replace(b, howMany.get(b)+1);
            else
                howMany.put(b, 1);
        }
        System.out.println(howMany);
    }

    public static void union(int[] a, int[] b) {
        HashSet<Integer> nums = new HashSet<Integer>();
        for(int c : a) 
            nums.add(c);
        for(int c : b)
            nums.add(c);
        System.out.println(nums);
    }

    public static int[] intersection(int[] x, int[] y) {
        HashSet<Integer> a = new HashSet<Integer>();
            for(int c : x) 
                a.add(c);
        HashSet<Integer> b = new HashSet<Integer>();
            for(int c : y) 
                b.add(c);
        HashMap<Integer, Integer> howMany = new HashMap<Integer, Integer>();
        ArrayList<Integer> hmm = new ArrayList<Integer>();
        for(int c : a) {
            if(howMany.containsKey(c)) {
                howMany.replace(c, howMany.get(c)+1);
                if(howMany.get(c) == 2) {
                    hmm.add(c);
                }
            }
            else
                howMany.put(c, 1);
        }
        for(int c : b) {
            if(howMany.containsKey(c)) {
                howMany.replace(c, howMany.get(c)+1);
                if(howMany.get(c) == 2) {
                    hmm.add(c);
                }
            }
            else
                howMany.put(c, 1);
        }

        int thing[] = new int[hmm.size()];
        for(int i=0; i<hmm.size(); i++) {
            thing[i] = hmm.get(i);
        }

        return thing;
    }
}
