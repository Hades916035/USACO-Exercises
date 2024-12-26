import java.util.*;

public class Test {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();
        sc.nextLine();
        String contest = sc.nextLine();

        Set<String> validMoos = new TreeSet<>();
        Map<String, Integer> freq = new HashMap<>();

        // Precompute frequencies for the original string
        for (int i = 0; i < N - 2; i++) {
            String moo = contest.substring(i, i + 3);
            if (isValidMoo(moo)) {
                freq.put(moo, freq.getOrDefault(moo, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() >= F) validMoos.add(entry.getKey());
        }

        // Simulate one character corruption
        for (int i = 0; i < N; i++) {
            char original = contest.charAt(i);
            for (char replacement = 'a'; replacement <= 'z'; replacement++) {
                if (replacement == original) continue;

                // Modify the string with the replacement
                String modified = contest.substring(0, i) + replacement + contest.substring(i + 1);

                // Only check substrings affected by the change
                for (int j = Math.max(0, i - 2); j <= Math.min(N - 3, i); j++) {
                    String moo = modified.substring(j, j + 3);
                    if (isValidMoo(moo)) {
                        int count = computeFrequency(modified, moo);
                        if (count >= F) validMoos.add(moo);
                    }
                }
            }
        }

        System.out.println(validMoos.size());
        for (String moo : validMoos) {
            System.out.println(moo);
        }
    }

    private static boolean isValidMoo(String moo) {
        if (moo.length() != 3) return false;
        return moo.charAt(0) != moo.charAt(1) && moo.charAt(1) == moo.charAt(2);
    }

    private static int computeFrequency(String s, String target) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            if (s.substring(i, i + 3).equals(target)) {
                count++;
            }
        }
        return count;
    }
}
/*
 public static int count(long n) {
        if(n<45) {
            return 0;
        } else if(n<445L && n>49L) {
            return 5;
        } else if(n<4445L && n>499L) {
            return 500-445+5;
        } else if(n<44445L && n>4999L) {
            return 5000-4445+500-445+5;
        } else if(n<444445L && n>49999L) {
            return 50000-44445+5000-4445+500-445+5;
        } else if(n<4444445L && n>499999L) {
            return 500000-444445+50000-44445+5000-4445+500-445+5;
        } else if(n<44444445L && n>4999999L) {
            return 5000000-4444445+500000-444445+50000-44445+5000-4445+500-445+5;
        } else if(n<444444445L && n>49999999L) {
            return 50000000-44444445+5000000-4444445+500000-444445+50000-44445+5000-4445+500-445+5;
        } else {
            return 500000000-444444445+50000000-44444445+5000000-4444445+500000-444445+50000-44445+5000-4445+500-445+5;
        }
    }

    import java.util.*;

public class MoosFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();
        sc.nextLine();
        String contest = sc.nextLine();

        Set<String> validMoos = new TreeSet<>();
        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < N - 2; i++) {
            char c1 = contest.charAt(i);
            char c2 = contest.charAt(i + 1);
            char c3 = contest.charAt(i + 2);
            if (c1 != c2 && c2 == c3) {
                String moo = "" + c1 + c2 + c3;
                freq.put(moo, freq.getOrDefault(moo, 0) + 1);
                if (freq.get(moo) >= F) validMoos.add(moo);
            }
        }

        for (int i = 0; i < N; i++) {
            char original = contest.charAt(i);
            for (char replacement = 'a'; replacement <= 'z'; replacement++) {
                if (replacement == original) continue;
                String modified = contest.substring(0, i) + replacement + contest.substring(i + 1);
                Map<String, Integer> tempFreq = new HashMap<>();
                for (int j = 0; j < N - 2; j++) {
                    char c1 = modified.charAt(j);
                    char c2 = modified.charAt(j + 1);
                    char c3 = modified.charAt(j + 2);
                    if (c1 != c2 && c2 == c3) {
                        String moo = "" + c1 + c2 + c3;
                        tempFreq.put(moo, tempFreq.getOrDefault(moo, 0) + 1);
                        if (tempFreq.get(moo) >= F) validMoos.add(moo);
                    }
                }
            }
        }

        System.out.println(validMoos.size());
        for (String moo : validMoos) {
            System.out.println(moo);
        }
    }
}
 */