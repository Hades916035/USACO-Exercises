import java.util.*;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n, m, a;
        n = kb.nextInt();
        m = kb.nextInt();
        a = kb.nextInt();

        

        if(n%a != 0) {
            if(m%a != 0) {
                System.out.println(((n/a)+1)*((m/a)+1));
            } else {
                System.out.println(((n/a)+1)*((m/a)));
            }
        } else if(m%a != 0) {
            System.out.println(((n/a))*((m/a)+1));
        } else {
            System.out.println(((n/a))*((m/a)));
        }
    }
}
