import java.util.*;

public class ArithmeticSeries {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input a1: ");
        int a1 = kb.nextInt();
        System.out.print("Input a2: ");
        int a2 = kb.nextInt();
        System.out.print("Input n: ");
        int n = kb.nextInt();
        int rate = a2 - a1;
        int nth = rate * (n-1) + a1;
        System.out.println("The " + n + "th term is " + nth);
    }
}
