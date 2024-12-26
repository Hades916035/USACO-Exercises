import java.util.*;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = kb.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = kb.nextInt();

        System.out.println("The LCM of " + n1 + " and " + n2 + " is " + lcm(n1, n2) + ", and the GCD is " + gcd(n1, n2));

        kb.close();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}