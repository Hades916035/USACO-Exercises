import java.util.*;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();
        a += kb.nextInt();

        if(a == 5)
            System.out.println(1);
        else if (a==4) 
            System.out.println(2);
        else
            System.out.println(3);
    }
}
