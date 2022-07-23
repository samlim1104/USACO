import java.util.*;
import java.io.*;
public class USACOLoadBalancing {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("balancing.in"));
		PrintWriter out = new PrintWriter("balancing.out");
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int min = Integer.MAX_VALUE;
		
		int[] xs = new int[n];
		int[] ys = new int[n];
		
		for(int i = 0; i<n; i++) {
			xs[i] = in.nextInt();
			ys[i] = in.nextInt();
		}
		
		
		for(int r = 0; r<n; r++) {
			for(int c = 0; c<n; c++) {
				int mx = xs[r]+1;
				int my = ys[c]+1;
				
				int q1 = 0, q2 = 0, q3 = 0, q4 = 0;
				
				for(int b = 0; b<n; b++) {
					if(xs[b] < mx && ys[b] > my) {
						q1++;
					}
					if(xs[b] > mx && ys[b] > my) {
						q2++;
					}
					if(xs[b] < mx && ys[b] < my) {
						q3++;
					}
					if(xs[b] > mx && ys[b] < my) {
						q4++;
					}
				}
				
				int max = Math.max(q1, Math.max(q2, Math.max(q3, q4)));
				
				if(max < min) {
					min = max;
				}
			}
		}
		
		out.println(min);
		
		in.close();
		out.close();
	}
}
