import java.util.*;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();

        int x = (int)((a*b) / 2);
        System.out.println(x);
    }
}
