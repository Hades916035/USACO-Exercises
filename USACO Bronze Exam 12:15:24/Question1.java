import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int t = kb. nextInt();

        long[] arr = new long[t];
        for(int i=0; i<t; i++) {
            int n = kb.nextInt();
            arr[i] = count((long)n);
        }

        for(long i : arr) {
            System.out.println(i);
        }

        kb.close();
    }

    public static long count(long n) {
        if(n<45) {
            return 0;
        } else if(n<445L && n>=49L) {
            return 5;
        } else if(n<4445L && n>=499L) {
            return 500-445+5;
        } else if(n<44445L && n>=4999L) {
            return 5000-4445+500-445+5;
        } else if(n<444445L && n>=49999L) {
            return 50000-44445+5000-4445+500-445+5;
        } else if(n<4444445L && n>=499999L) {
            return 500000-444445+50000-44445+5000-4445+500-445+5;
        } else if(n<44444445L && n>=4999999L) {
            return 5000000-4444445+500000-444445+50000-44445+5000-4445+500-445+5;
        } else if(n<444444445L && n>=49999999L) {
            return 50000000-44444445+5000000-4444445+500000-444445+50000-44445+5000-4445+500-445+5;
        } else if(n<4444444445L && n>=499999999L) {
            return 500000000-444444445+50000000-44444445+5000000-4444445+500000-444445+50000-44445+5000-4445+500-445+5;
        } else if(n<45) {
            return 0;
        } else if(n<445L) {
            return n-45+1;
        } else if(n<4445L) {
            return n-445+5+1;
        } else if(n<44445L) {
            return n-4445+500-445+5+1;
        } else if(n<444445L) {
            return n-44445+5000-4445+500-445+5+1;
        } else if(n<4444445L) {
            return n-444445+50000-44445+5000-4445+500-445+5+1;
        } else if(n<44444445L) {
            return n-4444445+500000-444445+50000-44445+5000-4445+500-445+5+1;
        } else if(n<444444445L) {
            return n-44444445+5000000-4444445+500000-444445+50000-44445+5000-4445+500-445+5+1;
        } else {
            return n-444444445+50000000-44444445+5000000-4444445+500000-444445+50000-44445+5000-4445+500-445+5+1;
        }
    }
}