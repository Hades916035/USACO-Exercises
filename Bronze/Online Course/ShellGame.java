import java.util.*;

public class ShellGame {
    private static int[] cups = {1, 2, 3};
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int score[] = {0, 0, 0};
        int rounds = kb.nextInt();

        for(int i=0; i<rounds; i++) {
            swap(kb.nextInt(), kb.nextInt());
            score[cups[kb.nextInt()-1]-1] += 1;
        }

        System.out.println(Math.max(Math.max(score[0], score[1]), score[2]));
    }

    public static void swap(int a, int b) {
        int temp = cups[a-1];
        cups[a-1] = cups[b-1];
        cups[b-1] = temp;
    }
}