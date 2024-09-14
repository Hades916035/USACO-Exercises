import java.util.*;

public class LongWords {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int x = kb.nextInt();
        for(int i=0; i<x; i++) {
            System.out.println(abrv(kb.next()));
        }
    }

    public static String abrv(String a) {
        String result = "";
        if(a.length() <= 10) {
            return a;
        } else {
            result = Character.toString(a.charAt(0)) + (a.length()-2) + Character.toString(a.charAt(a.length()-1));
            return result;
        }
    }
}
