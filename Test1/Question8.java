import java.util.*;

public class Question8{
    public static int factorial(int num){
        if(num==0||num==1)
            return 1;
        else
            return num*factorial(num-1);
    }
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int result = factorial(kb.nextInt());
        System.out.println("The factorial of the given number is " + result);
    }
}
