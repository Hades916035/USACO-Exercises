import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int result = 1;
        for(int i=2; i<=num; i++) {
            result *= i;
        }
        System.out.println(result);

        kb.close();
    }
}
