import java.util.*;

public class BitPlusPlus {
    private static int x = 0;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int opertations = kb.nextInt();

        for(int i=0; i<opertations; i++) {
            findOperation(kb.next());
        }

        System.out.println(x);
    }

    public static void findOperation(String a) {
        if(a.substring(0, 1).equals("+") || a.substring(1, 2).equals("+"))
            x++;
        else
            x--;
    }
}