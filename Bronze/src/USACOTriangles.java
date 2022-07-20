import java.util.*;
import java.io.*;
public class USACOTriangles {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("triangles.in"));
		PrintWriter out = new PrintWriter("triangles.out");
		
		int n = Integer.parseInt(in.nextLine());
		
		int[] xs = new int[n];
		int[] ys = new int[n];
		
		for(int i = 0; i<n; i++) {
			xs[i] = in.nextInt();
			ys[i] = in.nextInt();
		}
		
		int max = 0;
		
		for(int r = 0; r<n; r++) {
			for(int c = 0; c<n; c++) {
				if(r==c || xs[r] != xs[c]) {
					continue;
				}
				
				for(int k = 0; k<n; k++) {
					if(r==k || ys[r] != ys[k]) {
						continue;
					}
					
					max = Math.max(max, Math.abs(xs[k] - xs[r]) * Math.abs(ys[c] - ys[r]));
				}
			}
		}
		
		out.println(max);
		
		in.close();
		out.close();
	}
}
