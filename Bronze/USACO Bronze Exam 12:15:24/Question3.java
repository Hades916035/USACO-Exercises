import java.util.*;
import java.io.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int min = kb.nextInt();
        String letters = kb.next();

        if(n>5000){
            System.out.println(0);
            System.exit(0);
        }

        HashMap<String, Integer> moos = new HashMap<String, Integer>();
        ArrayList<String> possible = new ArrayList<String>();
        ArrayList<String> answers = new ArrayList<String>();

        String alpha = "abcdefghijklmonpqrstuvwxyz";

        if(min == 1) {
            for(int i=0; i<letters.length()-2; i++) {
                String s = letters.substring(i, i+3);
                if(s.charAt(1) != s.charAt(2) && s.charAt(0) != s.charAt(2)) {
                    String result = s.substring(0, 1) + s.substring(2, 3) + s.substring(2, 3);
                    if(!answers.contains(result)) answers.add(result);
                } else if(s.charAt(0) == s.charAt(2) && s.charAt(0) != s.charAt(1)) {
                    String result = s.substring(0, 1) + s.substring(1, 2) + s.substring(1, 2);
                    if(!answers.contains(result)) answers.add(result);
                } else if(s.charAt(0) != s.charAt(1) && s.charAt(1) == s.charAt(2)) {
                    if(!answers.contains(s)) answers.add(s);
                } else {
                    for(int j=0; j<26; j++) {
                        String result = alpha.substring(j, j+1) + s.substring(1, 2) + s.substring(1, 2);
                        if(!answers.contains(result) && !alpha.substring(j, j+1).equals(s.substring(1, 2))) answers.add(result);
                    }
                }
            }
        } else {

        // ArrayList<Integer> interval = new ArrayList<Integer>();
        for(int i=0; i<letters.length()-2; i++) {
            String s = letters.substring(i, i+3);
            if(s.charAt(0) != s.charAt(1) && s.charAt(1) == s.charAt(2)) {
                if(moos.containsKey(s)) {
                    moos.replace(s, moos.get(s)+1);
                    if(moos.get(s) == min) {
                        answers.add(s);
                        // if(interval.contains(possible.indexOf(s)))
                        //     interval.remove(possible.indexOf(s));
                        possible.remove(s);
                    } else if(moos.get(s) == min-1) {
                        possible.add(s);
                        // interval.add(i);
                    }
                } else {
                    moos.put(s, 1);
                    if(min == 2) {
                        possible.add(s);
                    }
                }
            }
        }

        for(String test : possible) {
            for(int i=0; i<letters.length()-2; i++) { //if(interval.get(possible.indexOf(test)) < i-2 || possible.indexOf(test) > i+2) {
                if(letters.indexOf(test) > i+2 || letters.indexOf(test) < i-2) {
                    String s = letters.substring(i, i+3);
                    if(test.charAt(0) == s.charAt(0) && test.charAt(1) == s.charAt(1) && test.charAt(2) != s.charAt(2)) {
                        if(!answers.contains(test)) answers.add(test);
                    } else if(test.charAt(0) == s.charAt(0) && test.charAt(1) != s.charAt(1) && test.charAt(2) == s.charAt(2)) {
                        if(!answers.contains(test)) answers.add(test);
                    } else if(test.charAt(0) != s.charAt(0) && test.charAt(1) == s.charAt(1) && test.charAt(2) == s.charAt(2)) {
                        if(!answers.contains(test)) answers.add(test);
                    }
                }
            } //}
        }

        }

        Collections.sort(answers);
        System.out.println(answers.size());
        for(String s : answers) {
            System.out.println(s);
        }

        kb.close();
    }
}