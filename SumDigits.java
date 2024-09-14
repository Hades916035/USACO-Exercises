import java.util.*;

public class SumDigits {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int x = kb.nextInt();
        for(int i=0; i<x; i++) {
            int y = kb.nextInt();
            y = y%10 + y/10;
            System.out.println(y);
        }
    }
}
