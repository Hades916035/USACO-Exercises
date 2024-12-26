import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int sum = 1;
        for(int i=2; i<=(int)(Math.sqrt(num)); i++) {
            if(num % i == 0) {
                sum += i;
                if(!(num/i == i)) {
                    sum += num/i;
                }
            }
        }
        if(num == sum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        kb.close();
    }
}