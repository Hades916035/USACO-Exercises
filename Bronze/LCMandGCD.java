import java.util.*;

public class LCMandGCD {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int greatest = gcd(n1, n2);
        int least = (n1/greatest) * n2;
        System.out.println("GCD: " + greatest
                  + "\n" + "LCM: " + least);

        kb.close();
    }

    public static int gcd(int a, int b) {
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    } 
}
