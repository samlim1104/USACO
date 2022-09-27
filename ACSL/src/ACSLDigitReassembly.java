import java.util.*;
public class ACSLDigitReassembly {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			String[] w = in.nextLine().split(" ");
			
			int length = w[0].length();
			
			int n = Integer.parseInt(w[1]);
			
			
			int startInd = 0;
			
			long sum = 0;
			
			while(n <= length) {
				sum += Long.parseLong(w[0].substring(startInd, n));
				
				startInd++;
				n++;
			}
			
			System.out.println(sum);
		}
	}
}
