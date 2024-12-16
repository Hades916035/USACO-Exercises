import java.util.*;
import java.io.*;

public class TeamTicTacToe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("tttt.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tttt.out")));

        char[][] arr = new char[3][3];
        for (int i = 0; i < 3; i++) {
            String x = br.readLine();
            for (int j = 0; j < 3; j++) {
                arr[i][j] = x.charAt(j);
            }
        }

        int[] result = winners(arr);
        pw.println(result[0]);
        pw.println(result[1]);

        pw.close();
        br.close();
    }

    public static int[] winners(char[][] arr) {
        Set<Character> onePlayerWinners = new HashSet<>();
        Set<Set<Character>> twoPlayerTeams = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            checkLine(arr[i][0], arr[i][1], arr[i][2], onePlayerWinners, twoPlayerTeams);
            checkLine(arr[0][i], arr[1][i], arr[2][i], onePlayerWinners, twoPlayerTeams);
        }
        checkLine(arr[0][0], arr[1][1], arr[2][2], onePlayerWinners, twoPlayerTeams);
        checkLine(arr[0][2], arr[1][1], arr[2][0], onePlayerWinners, twoPlayerTeams);

        int[] result = {onePlayerWinners.size(), twoPlayerTeams.size()};
        return result;
    }

    private static void checkLine(char a, char b, char c, Set<Character> onePlayerWinners, Set<Set<Character>> twoPlayerTeams) {
        if (a == b && b == c) {
            onePlayerWinners.add(a);
        } else if (a == b || b == c || a == c) {
            Set<Character> team = new HashSet<>(Arrays.asList(a, b, c));
            if (team.size() == 2) {
                twoPlayerTeams.add(team);
            }
        }
    }
}

/*import java.util.*;
import java.io.*;

public class TeamTicTacToe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("tttt.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("tttt.out")));

        char[][] arr = new char[3][3];
        for(int i=0; i<3; i++) {
            String x = br.readLine();
            for(int j=0; j<3; j++) {
                arr[i][j] = x.charAt(j);
            }
        }

        int[] result = winners(arr);
        pw.println(result[0] + "\n" + result[1]);

        pw.close();
        br.close();
    }

    public static int[] winners(char[][] arr) {
        ArrayList<Character> one = new ArrayList<>();
        HashMap<Character, Character> two = new HashMap<>();
        //diagonal one
        if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && !one.contains(arr[0][0]))
            one.add(arr[0][0]);
        if(arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2] && !one.contains(arr[2][0]))
            one.add(arr[2][0]);
        //diagonal two (top left)
        if(arr[0][0] == arr[1][1] && arr[0][0] != arr[2][2]) {
            if(!(two.containsKey(arr[0][0])))
                two.put(arr[0][0], arr[2][2]);
            else if(!(two.get(arr[0][0]) == arr[2][2]))
                two.put(arr[0][0], arr[2][2]);
        }
        if(arr[1][1] == arr[2][2] && arr[0][0] != arr[2][2]) {
            if(!(two.containsKey(arr[1][1])))
                two.put(arr[0][0], arr[2][2]);
            else if(!(two.get(arr[1][1]) == arr[0][0]))
                two.put(arr[0][0], arr[2][2]);
        }
        if(arr[0][0] == arr[2][2] && arr[1][1] != arr[2][2]) {
            if(!(two.containsKey(arr[0][0])))
                two.put(arr[1][1], arr[2][2]);
            else if(!(two.get(arr[0][0]) == arr[1][1]))
                two.put(arr[1][1], arr[2][2]);
        }
        //diagonal two (top right)
        if(arr[0][2] == arr[1][1] && arr[0][2] != arr[2][0]) {
            if(!(two.containsKey(arr[0][2]) && two.get(arr[0][2]) == arr[2][0]))
                two.put(arr[0][2], arr[2][0]);
        }
        if(arr[1][1] == arr[2][0] && arr[0][2] != arr[2][0]) {
            if(!(two.containsKey(arr[1][1]) && two.get(arr[1][1]) == arr[0][2]))
                    two.put(arr[0][2], arr[2][0]);
        }
        if(arr[0][2] == arr[2][0] && arr[1][1] != arr[2][0]) {
            if(!(two.containsKey(arr[0][2]) && two.get(arr[0][2]) == arr[1][1]))
                two.put(arr[1][1], arr[2][0]);
        }
        for(int i=0; i<3; i++) {
            //horizontal one
            if(arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] && !one.contains(arr[i][0]))
                one.add(arr[i][0]);
            //vertical one
            if(arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i] && !one.contains(arr[0][i]))
                one.add(arr[0][i]);
            //horizontal two
            if(arr[i][0] == arr[i][1] && arr[i][0] != arr[i][2]) {
                if(!(two.containsKey(arr[i][0]) && two.get(arr[i][0]) == arr[i][2]))
                    two.put(arr[i][0], arr[i][2]);
            }
            if(arr[i][1] == arr[i][2] && arr[i][0] != arr[i][2]) {
                if(!(two.containsKey(arr[i][1]) && (two.get(arr[i][1]) == arr[i][0])))
                    two.put(arr[i][0], arr[i][2]);
            }
            if(arr[i][0] == arr[i][2] && arr[i][1] != arr[i][2]) {
                if(!(two.containsKey(arr[i][0]) && two.get(arr[i][0]) == arr[i][1]))
                    two.put(arr[i][1], arr[i][2]);
            }
            //vertical two
            if(arr[0][i] == arr[1][i] && arr[0][i] != arr[2][i]) {
                if(!(two.containsKey(arr[0][i]) && two.get(arr[0][i]) == arr[2][i]))
                    two.put(arr[0][i], arr[2][i]);
            }
            if(arr[1][i] == arr[2][i] && arr[0][i] != arr[2][i]) {
                if(!(two.containsKey(arr[1][i]) && two.get(arr[1][i]) == arr[0][i]))
                    two.put(arr[0][i], arr[2][i]);
            }
            if(arr[0][i] == arr[2][i] && arr[1][i] != arr[2][i]) {
                if(!(two.containsKey(arr[0][i]) && two.get(arr[0][i]) == arr[1][i]))
                    two.put(arr[1][i], arr[2][i]);
            }
        }
        int[] result = {one.size(), two.size()};
        return result;
    }
}
*/