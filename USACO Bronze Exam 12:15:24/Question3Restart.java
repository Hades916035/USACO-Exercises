import java.util.*;

public class Question3Restart {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int f = kb.nextInt();
        String s = kb.next();

        if(n>5000){
            System.out.println(0);
            System.exit(0);
        }

        ArrayList<String> moos = new ArrayList<String>();
        HashMap<String, Integer> count = new HashMap<String, Integer>();

        for(int i=0; i<n-2; i++) {
            char[] part = {s.charAt(i), s.charAt(i+1), s.charAt(i+2)};
            if(part[0] != part[1] && part[1] == part[2]) {
                count.put(("" + part[0] + part[1] + part[2]), count.getOrDefault(("" + part[0] + part[1] + part[2]), 0)+1);
                if(count.get(("" + part[0] + part[1] + part[2])) == f)
                    if(!moos.contains(("" + part[0] + part[1] + part[2]))) moos.add(("" + part[0] + part[1] + part[2]));
            }
        }

        for(int i=0; i<n; i++) {
            char real = s.charAt(i);
            for(char alpha = 'a'; alpha<='z'; alpha++) {
                if(real != alpha) {
                    String change = s.substring(0, i) + alpha + s.substring(i+1);
                    HashMap<String, Integer> newCount = new HashMap<String, Integer>();
                    for(int j=0; j<n-2; j++) {
                        char[] part = {change.charAt(j), change.charAt(j+1), change.charAt(j+2)};
                        if(part[0] != part[1] && part[1] == part[2]) {
                            newCount.put(("" + part[0] + part[1] + part[2]), newCount.getOrDefault(("" + part[0] + part[1] + part[2]), 0)+1);
                            if(newCount.get(("" + part[0] + part[1] + part[2])) == f)
                            if(!moos.contains(("" + part[0] + part[1] + part[2]))) moos.add(("" + part[0] + part[1] + part[2]));
                        }
                    }
                }
            }
        }

        Collections.sort(moos);
        System.out.println(moos.size());
        for(String result : moos) {
            System.out.println(result);
        }

        kb.close();
    }
}
