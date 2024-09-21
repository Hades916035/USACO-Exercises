import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int x, result;
        result=0;

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                x = kb.nextInt();
                if(x == 1) {
                    result = Math.abs(i-3) + Math.abs(j-3);
                }
            }
        }

        System.out.println(result);
    }
}
