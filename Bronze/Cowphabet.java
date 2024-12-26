import java.util.*;

public class Cowphabet {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String x = kb.next();
        int count = 1;
        for(int i=1; i<x.length(); i++) {
            if(x.charAt(i) < x.charAt(i-1))
                count++;
        }
        System.out.println(count);
    }
}