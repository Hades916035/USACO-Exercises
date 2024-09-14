import java.util.*;

public class StringTask {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String x = kb.next();
        x = x.toLowerCase();

        String result = "";

        for(int i=0; i<x.length(); i++) {
            if(!(x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u' || x.charAt(i) == 'y')) {
                result += "." + Character.toString(x.charAt(i));
            }
        }
        System.out.println(result);
    }
}
