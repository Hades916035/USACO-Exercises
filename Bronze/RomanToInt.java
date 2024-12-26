import java.util.HashMap;
import java.util.*;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
    public static int romanToInt(String s) {
        HashMap<String, Integer> nums = new HashMap<String, Integer>();
        nums.put("I", 1);
        nums.put("V", 5);
        nums.put("X", 10);
        nums.put("L", 50);
        nums.put("C", 100);
        nums.put("D", 500);
        nums.put("M", 1000);

        int result = 0;
        for(int i=0; i<(s.length()-1); i++) {
            if(nums.get(Character.toString(s.charAt(i))) < nums.get(Character.toString(s.charAt(i + 1))))
                result -= nums.get(Character.toString(s.charAt(i)));
            else
                result += nums.get(Character.toString(s.charAt(i)));
        }
        result += nums.get(Character.toString(s.charAt(s.length() - 1)));
        return result;
    }
}