import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String num = kb.next();
        int sum = 0;
        for(int i=0; i<(num.length()); i++) {
            int digit = num.length() - i - 1;
            sum += ((int)(num.charAt(digit)) - 48) * (Math.pow(10, digit + 1));
        }
        sum = sum/10;
        System.out.println(sum);

        kb.close();
    }
}