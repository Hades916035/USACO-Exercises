import java.util.Scanner;

public class Shower {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();

        for (int f = 0; f < x; f++) {
            int n = kb.nextInt();
            int s = kb.nextInt();
            int m = kb.nextInt();

            int arr[] = new int[m];
            int a, b;
            int result = 0;

            for (int i = 0; i < n; i++) {
                a = kb.nextInt();
                b = kb.nextInt();
                if (a < 0) a = 0;
                if (b > m) b = m;
                for (int j = a; j < b; j++) {
                    arr[j] = 1;
                }
            }

            int count = 0;
            for (int k = 0; k < m; k++) {
                if (arr[k] != 1)
                    count++;
                else
                    count = 0;

                if (count >= s) {
                    result = 1;
                    break;
                }
            }

            if (result == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

/*
import java.util.*;

public class Shower {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int x = kb.nextInt();
        for(int f=0; f<x; f++) {
            int n = kb.nextInt();
            int s = kb.nextInt();
            int m = kb.nextInt();

            int arr[] = new int[m];
            int a,b;
            int result = 0;

            for(int i=0; i<n; i++) {
                a=kb.nextInt();
                b=kb.nextInt();
                for(int j=a; j<b; j++) {
                    arr[j] = 1;
                }
            }

            int count=0;
            for(int k=0; k<arr.length; k++) {
                if(arr[k] != 1)
                    count++;
                else
                    count = 0;

                if (count >= s) {
                    System.out.println("YES");
                    result++;
                }
            }
            if(result == 0)
                System.out.println("NO");
        }
    }
}

    public static String check() {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int s = kb.nextInt();
        int m = kb.nextInt();

        int arr[] = new int[m];
        int a,b;

        for(int i=0; i<n; i++) {
            a=kb.nextInt();
            b=kb.nextInt();
            for(int j=a; j<b; j++) {
                arr[j] = 1;
            }
        }

        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 1)
                count++;
            else
                count = 0;

            if (count >= s) {
                return "YES";
            }
        }
        return "NO";
    }
}
*/