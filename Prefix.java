public class Prefix {
    public static String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for(String a : strs) {
            result = check(a, result);
        }
        return result;
    }
    
    public static String check(String a, String b) {
        String result = "";
        for(int i=0; i<a.length() && i<b.length(); i++) {
            if(a.charAt(i) == b.charAt(i)) {
                result += Character.toString(a.charAt(i));
            } else
                break;
        }
        return result;
    }
}
