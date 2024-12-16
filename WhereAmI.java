import java.util.*;
import java.io.*;

public class WhereAmI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("whereami.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("whereami.out")));

        int n = Integer.parseInt(br.readLine());
        String mailboxes = br.readLine();

        int k = 1;

        while (k <= n) {
            ArrayList<String> seenSequences = new ArrayList<String>();
            boolean isUnique = true;

            for (int i = 0; i <= n - k; i++) {
                String substring = mailboxes.substring(i, i + k);

                if (seenSequences.contains(substring)) {
                    isUnique = false;
                    break;
                }

                seenSequences.add(substring);
            }

            if (isUnique) {
                break;
            }

            k++;
        }

        pw.println(k);
        pw.close();
        br.close();
    }
}
