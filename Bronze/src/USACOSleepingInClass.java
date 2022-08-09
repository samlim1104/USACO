import java.util.*;
import java.io.*;
public class USACOSleepingInClass {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int i = 0; i<T; i++) {
			
			ArrayList<Integer> numbers = new ArrayList<>();
			
			int N = in.nextInt();
			String[] r = in.nextLine().split(" ");
			
			int maxNum = 0;
			
			for(int c = 0; c<r.length; c++) {
				numbers.add(Integer.parseInt(r[c]));
			}
			
			for(int w = 0; w<numbers.size(); w++) {
				
			}
			
		}
	}
}
