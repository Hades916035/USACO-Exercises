import java.util.*;

public class TeamProblemSolving {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int x = kb.nextInt();
        int solvable = 0;
        int ppl = 0;
        for(int i=0; i<x; i++) {
            ppl += kb.nextInt();
            ppl += kb.nextInt();
            ppl += kb.nextInt();
            if(ppl > 1) 
                solvable++;
            ppl = 0;
        }
        System.out.println(solvable);
    }
}
