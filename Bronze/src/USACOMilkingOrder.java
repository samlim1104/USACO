import java.util.*;
import java.io.*;
public class USACOMilkingOrder {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("milkorder.in"));
		PrintWriter out = new PrintWriter("milkorder.out");
		
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		
		int[] cows = new int[n];
		
		int[] order = new int[m];
		
		for(int i = 0; i<m; i++) {
			order[i] = in.nextInt();
		}
		
		for(int i = 0; i<k; i++) {
			int num = in.nextInt();
			int pos = in.nextInt();
			
			cows[pos] = num;
		}
		
		for(int i = 0; i<n; i++) {
			if(cows[i] != 0) {
				
			}
		}
	}
}
