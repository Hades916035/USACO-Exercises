import java.util.*;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int aCount=0;
        int bCount=0;

        for(int i=0; i<a.length(); i++) {
            aCount += a.charAt(i);
            bCount += b.charAt(i);
        }

        if(aCount < bCount)
            System.out.println(-1);
        else if(aCount > bCount)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
