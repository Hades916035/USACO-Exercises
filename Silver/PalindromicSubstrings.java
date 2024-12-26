import java.util.*;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
    }

    public static int countSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<s.length()+1; j++) {
                if(palindrome(s.substring(i, j))) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean palindrome(String s) {
        int pointers[] = {0, s.length()-1};
        while(pointers[0] < pointers[1]) {
            if(s.charAt(pointers[0]) != s.charAt(pointers[1]))
                return false;
            pointers[0]++; pointers[1]--;
        }

        return true;
    }
}
