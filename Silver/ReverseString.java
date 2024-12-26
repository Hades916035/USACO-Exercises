import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Hello, world!"));
    }

    public static String reverse(String s) {
        Stack str = new Stack();
        String result = "";
        for(int i=0; i<s.length(); i++) {
            str.push(s.substring(i, i+1));
        }
        for(int i=0; i<s.length(); i++) {
            result += str.top();
            str.pop();
        }

        return result;
    }
}
