import java.util.*;

public class Capitolization {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String x = kb.next();
        x = x.substring(0,1).toUpperCase() + x.substring(1);
        System.out.println(x);
    }
}
