import java.util.*;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int i=n; i>=0; i--) {
            for(int j=n; j>0; j--) {
                System.out.print((Integer.toString(j)).repeat(i));
            }
            System.out.println();
        }

        kb.close();
    }
}
