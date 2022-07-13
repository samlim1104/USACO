import java.util.*;
import java.io.*;
public class USACOMaximumDistance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = Integer.parseInt(in.nextLine());
		int[] xs = new int[N];
		int[] ys = new int[N];
		
		for(int i = 0; i<N; i++) {
			xs[i] = in.nextInt();
		}
		
		for(int a = 0; a<N; a++) {
			ys[a] = in.nextInt();
		}
		
		int max = 0;
		
		for(int r = 0; r<N; r++) {
			for(int c = r+1; c<N; c++) {
				int m = Math.abs(xs[r] - xs[c]) *  Math.abs(xs[r] - xs[c]) + Math.abs(ys[r]-ys[c]) * Math.abs(ys[r]-ys[c]);
				
				max = Math.max(max, m);
			}
		}
		
		System.out.println(max);
	}
}
