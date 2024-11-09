import java.util.*;

public class Censoring {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        String s = kb.next();
        String t = kb.next();

        for(int i=0; i<(s.length() - t.length()); i++) {
            if(s.substring(i, i+t.length()).equals(t)) {
                s = s.substring(0, i) + s.substring(i+t.length());
                i-=t.length();
            }
        }

        System.out.println(s);
    }
}
