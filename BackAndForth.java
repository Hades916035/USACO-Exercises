import java.io.*;
import java.util.*;

public class BackAndForth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("backforth.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("backforth.out"));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> barn1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            barn1.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> barn2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            barn2.add(Integer.parseInt(st.nextToken()));
        }
        
        Set<Integer> possibleAmounts = new HashSet<>();
        
        simulate(1000, 1000, barn1, barn2, 0, possibleAmounts);
        
        pw.println(possibleAmounts.size());
        pw.close();
        br.close();
    }
    
    private static void simulate(int milk1, int milk2, ArrayList<Integer> barn1, ArrayList<Integer> barn2, int day, Set<Integer> possibleAmounts) {
        if (day == 4) {
            possibleAmounts.add(milk1);
            return;
        }
        
        ArrayList<Integer> currentBarn = (day % 2 == 0) ? barn1 : barn2;
        ArrayList<Integer> nextBarn = (day % 2 == 0) ? barn2 : barn1;
        
        for (int i = 0; i < currentBarn.size(); i++) {
            int bucket = currentBarn.get(i);
            
            currentBarn.remove(i);
            nextBarn.add(bucket);
            
            if (day % 2 == 0) {
                simulate(milk1 - bucket, milk2 + bucket, barn1, barn2, day + 1, possibleAmounts);
            } else {
                simulate(milk1 + bucket, milk2 - bucket, barn1, barn2, day + 1, possibleAmounts);
            }
            
            nextBarn.remove(nextBarn.size() - 1);
            currentBarn.add(i, bucket);
        }
    }
}

/*import java.util.*;
import java.io.*;

public class BackAndForth {
    private static ArrayList<Integer> tankFilledUp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("backforth.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));

        int[][] arr = new int[2][11];
        arr[0][10] = -1; arr[1][10] = -1;
        for(int i=0; i<2; i++) {
            String[] x = br.readLine().split(" ");
            for(int j=0; j<10; j++) {
                arr[i][j] = Integer.parseInt(x[j]);
            }
        }

        simul(arr, 0, 1000);
        pw.println(tankFilledUp.size());

        br.close();
        pw.close();
    }

    public static int[] count(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int a : arr) {
            if(!nums.contains(a) && a!=-1)
                nums.add(a);
        }
        int[] result = new int[nums.size()];
        for(int i=0; i<result.length; i++) {
            result[i] = nums.get(i);
        }
        return result;
    }

    public static int[] replace(int[] arr, int a) {
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] == -1) {
                arr[i] = a;
                return arr;
            }
        }
        return null;
    }

    public static int[] remove(int[] arr, int a) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == a) {
                arr[i] = -1;
                return arr;
            }
        }
        return null;
    }

    public static int simul(int[][] arr, int day, int tank) {
        int[] possible = count(arr[day%2]);
        if(day==5) {
            if(!tankFilledUp.contains(tank))
                tankFilledUp.add(tank);
            return 0;
        }
        for(int i : possible) {
            if(day%2 == 0) {
                arr[0] = remove(arr[0], i);
                arr[1] = replace(arr[1], i);
                simul(arr, day, tank - i);
            } else {
                arr[0] = replace(arr[0], i);
                arr[1] = remove(arr[1], i);
                simul(arr, day, tank + i);
            }
        }
        return 0;
    }
}*/