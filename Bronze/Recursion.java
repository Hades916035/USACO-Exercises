import java.util.*;

public class Recursion {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = kb.nextLine();
        System.out.print("Enter a integer: ");
        int n = kb.nextInt();

        System.out.print("Factorial: " + factorial(n) + 
                           "\nFibonacci: " + fibonacci(n) + 
                           "\nSum of Natural Numbers: " + sumOfNatural(n) + 
                           "\nReverse String: " + reverseString(s) + 
                           "\nPrint Numbers: ");
        printNums(n);
        System.out.println();
    }

    public static int factorial(int n) {
        if(n==2)
            return 2;
        else
            return n*factorial(n-1);
    }

    public static int fibonacci(int n) {
        if (n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumOfNatural(int n) {
        if(n==1)
            return 1;
        else
            return n + sumOfNatural(n-1);
    }

    public static String reverseString(String s) {
        if(s.length() == 1)
            return s;
        else
            return (s.substring(s.length()-1) + reverseString(s.substring(0, s.length()-1)));
    }

    public static void printNums(int n) {
        if(n==1) {
            System.out.print(1 + " ");
        } else {
            System.out.print(n + " ");
            printNums(n-1);
        }
    }
}