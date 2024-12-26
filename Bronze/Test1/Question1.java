public class Question1 {

    public static boolean isAdditiveNumber(String s) {
        int n = s.length();

        for (int i = 1; i <= n / 2; i++) {
            if (s.charAt(0) == '0' && i > 1) break;

            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == '0' && j - i > 1) break;

                String num1 = s.substring(0, i);
                String num2 = s.substring(i, j);

                if (isValid(num1, num2, s.substring(j))) {
                    return true;
                }
            }
        }
    }
}