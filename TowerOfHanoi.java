import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int rings = kb.nextInt();
        System.out.println(hanoiMoves(rings));
    }
    
    public static int hanoiMoves(int n) {
            if (n == 1) {
                return 1;
            }
            return 2 * hanoiMoves(n - 1) + 1;
        }
}
