import java.util.*;

public class JumpingNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String num = kb.next();
        boolean jumping = true;
        for(int i=1; i<num.length() - 1; i++) {
            if(!(Math.abs(num.charAt(i) - num.charAt(i-1)) == 1)) {
                jumping = false;
            }
        }
        System.out.println(jumping);

        kb.close();
    }
}