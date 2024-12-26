import java.util.*;
import java.io.*;

public class SleepyCowHerding {

	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(new File("herding.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("herding.out"));

		int[] list = new int[3];
		for (int i=0; i<3; i++)
			list[i] = kb.nextInt();
		Arrays.sort(list);
		
		pw.println(min(list));
		pw.println(max(list));
		pw.close();
		kb.close();	
	}
	
	public static int min(int[] list) {
		if (list[2]-list[0] == 2) 
			return 0;
		if (list[1] - list[0] == 2 || list[2] - list[1] == 2) 
			return 1;
		
		return 2;
	}

	public static int max(int[] list) {
		return Math.max(list[1]-list[0]-1, list[2]-list[1]-1);
	}	
}