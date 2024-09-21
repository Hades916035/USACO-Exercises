import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = 0;
        int a = kb.nextInt();
        int b = kb.nextInt();
        for(int i=0; i<a; i++) {
            if(kb.nextInt() > b)
                count++;
        }
        System.out.println(count);
    }
}
