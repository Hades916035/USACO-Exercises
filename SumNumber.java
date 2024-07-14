import java.util.*;

public class SumNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String num = kb.next();
        int sum = 0;
        for(int i=0; i<num.length(); i++) {
            sum += (int)(Integer.parseInt(num.substring(i, i+1)));
        }
        System.out.println(sum);

        kb.close();
    }
}
