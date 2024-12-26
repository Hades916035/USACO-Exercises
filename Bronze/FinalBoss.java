import java.util.*;

public class FinalBoss {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int testCases = kb.nextInt();
        for(int i=0; i<testCases; i++) {

        }
    }

    public static int fight(int hp, int[] attacks, int[] cooldown) {
        int arr[] = cooldown;
        int move=0;

        for(int a : attacks) {
            hp -= a;
        }
        while(hp>0) {
            for(int i=0; i<attacks.length; i++) {
                
            }
        }
        return move;
    }
}