import java.util.*;

public class WhiteSheet {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int wx1 = kb.nextInt();
        int wy1 = kb.nextInt();
        int wx2 = kb.nextInt();
        int wy2 = kb.nextInt();

        int b1x1 = kb.nextInt();
        int b1y1 = kb.nextInt();
        int b1x2 = kb.nextInt();
        int b1y2 = kb.nextInt();

        int b2x1 = kb.nextInt();
        int b2y1 = kb.nextInt();
        int b2x2 = kb.nextInt();
        int b2y2 = kb.nextInt();

        if(!(b1x1 <= wx1 && b1x2 >= wx2) && !(b2x1 <= wx1 && b2x2 >= wx2))
            System.out.println("YES");
        if(!(b1y1 <= wy1 && b1y2 >= wy2) && !(b2y1 <= wy1 && b2y2 >= wy2))
            System.out.println("YES");
        else if(b1x1 <= wx1 && b1x2 >= wx2 && b1y1 <= wy1 && b1y2 >= wy2)
            System.out.println("NO");
        else if(b2x1 <= wx1 && b2x2 >= wx2 && b2y1 <= wy1 && b2y2 >= wy2)
            System.out.println("NO");
        
    }
}
