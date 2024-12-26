import java.util.*;

public class Watermelon {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        if(x % 2 == 0 && x>2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        kb.close();
    }
}