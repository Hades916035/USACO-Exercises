import java.io.*;
import java.util.*;

public class WordProcessor {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("word.out")));
        BufferedReader br = new BufferedReader(new FileReader("word.in"));

        String numbers = br.readLine();
        int charsPerLine = Integer.parseInt(numbers.substring(numbers.indexOf(" ")+1));
        String sentence = br.readLine();
        ArrayList<String> words2 = new ArrayList<String>();
        int[] index = {0,0};

        for(int i=0; i<sentence.length(); i++) {
            if(sentence.charAt(i) == ' ') {
                words2.add(sentence.substring(index[0], index[1]+1));
                index[1]++;
                index[0] = index[1];
            } else {
                index[1]++;
            }
        }
        words2.add(sentence.substring(index[0]));

        int lineLength = 0;
        for(String i : words2) {
            int x = (i).length();
            if(lineLength + x >= charsPerLine) {
                pw.print(i + "\n");
                lineLength = 0;
            } else {
                pw.print(i);
                lineLength += x;
            }
        }
        pw.close(); 
    }
}

/*
        for(int i=0; i<words2.size(); i++) {
            int x = (words2.get(i)).length();
            if(lineLength + x >= charsPerLine) {
                pw.print(words2.get(i) + "\n");
                lineLength = 0;
            } else {
                pw.print(words2.get(i));
                lineLength += x;
            }
        }
 */