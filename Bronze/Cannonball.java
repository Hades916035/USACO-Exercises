import java.util.*;

public class Cannonball {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int s = kb.nextInt();
        int power = 1;

        int[][] line = new int[n][2];
        int target = 0;
        for(int i=0; i<n; i++) {
            line[i][0] = kb.nextInt(); // 0 is jump pad, 1 is target
            line[i][1] = kb.nextInt(); // v
            if(line[i][0] == 1)
                target++;
        }

        int targetsBroken = 0;
        HashMap<Integer, Integer> hitPlaces = new HashMap<Integer, Integer>();
        while(s<=n && s>=1) {
            if(hitPlaces.containsKey(s) && hitPlaces.get(s) == power)
                break;
            else
                hitPlaces.put(s, power);
            if(line[s-1][0] == 0) {
                if(power < 0) {
                    power -= line[s-1][1];
                    power *= -1;
                } else if(power > 0) {
                    power += line[s-1][1];
                    power *= -1;
                }
            } else if(line[s-1][0] == 1 && line[s-1][1] <= Math.abs(power)) {
                target--;
                targetsBroken++;
                line[s-1][0] = -1;
            }
            s = s + power;
            if(target == 0)
                break;
        }

        System.out.println(targetsBroken);

        kb.close();
    }
}
