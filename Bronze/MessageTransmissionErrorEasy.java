import java.util.*;

public class MessageTransmissionErrorEasy {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String msg = kb.next();

        overlap(msg);
    }

    public static boolean overlap(String msg) {
        for(int i=(msg.length()/2 + 1); i<msg.length(); i++) {
            if(msg.substring(0, 1).equals(msg.substring(msg.length() - i, msg.length() - i + 1))) {
                if(msg.substring(0, i).equals(msg.substring(msg.length() - i))) {
                    System.out.println("YES \n" + msg.substring(0, i));
                    return true;
                }
            }
        }
        System.out.println("NO");
        return false;
    }
}
