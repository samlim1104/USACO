import java.util.*;
import java.io.*;
public class USACOBreedCounting {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("bcount.in"));
		PrintWriter out = new PrintWriter("bcount.out");
		
		int n = in.nextInt();
		int q = in.nextInt();
		
		int[] cows = new int[n];
		
		for(int i = 0; i<n; i++) {
			cows[i] = in.nextInt()-1;
		}
		
		int[][] prefix = new int[n+1][3];
		
		for(int e = 0; e<n+1; e++) {
			if(e == 0) {
				prefix[0][0] = 0;
				prefix[0][1] = 0;
				prefix[0][2] = 0;
			}
			else {
			if(cows[e-1] == 0) {
				prefix[e][cows[e-1]] = prefix[e-1][cows[e-1]] + 1;
				prefix[e][1] = prefix[e-1][1];
				prefix[e][2] = prefix[e-1][2];
			}
			if(cows[e-1] == 1) {
				prefix[e][cows[e-1]] = prefix[e-1][cows[e-1]] + 1;
				prefix[e][0] = prefix[e-1][0];
				prefix[e][2] = prefix[e-1][2];
			}
			if(cows[e-1] == 2) {
				prefix[e][cows[e-1]] = prefix[e-1][cows[e-1]] + 1;
				prefix[e][1] = prefix[e-1][1];
				prefix[e][0] = prefix[e-1][0];
			}
			}
		}
		
		for(int a = 0; a<q; a++) {
			int r = in.nextInt();
			int c = in.nextInt();
			
			out.print(prefix[c][0] - prefix[r-1][0] + " ");
			out.print(prefix[c][1] - prefix[r-1][1] + " ");
			out.print(prefix[c][2] - prefix[r-1][2]);
			
			out.println();
		}
		
		in.close();
		out.close();
	}
}
