import java.util.*;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Number: ");
        String num = kb.next();
        int a = (int)(num.charAt(0)) - 48;
        int b = (int)(num.charAt(1)) - 48;
        int c = (int)(num.charAt(2)) - 48;
        boolean armstrong = (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == (100*a + 10*b + c));
        System.out.println(armstrong);

        kb.close();
    }
}
