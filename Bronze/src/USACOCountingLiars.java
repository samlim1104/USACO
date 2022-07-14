import java.util.*;
import java.io.*;
public class USACOCountingLiars {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = Integer.parseInt(in.nextLine());
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		int count = 0;
		
		for(int i = 0; i<N; i++) {
			String[] pp = in.nextLine().split(" ");
			
			String p = pp[0];
			int v = Integer.parseInt(pp[1]);
			
			if(p.equals("G")) {
				if(v > max) {
					count++;
				}
				else {
					min = v;
				}
			}
			if(p.equals("L")) {
				if(v < min) {
					count++;
				}
				else {
					max = v;
				}
			}
		}
		
		System.out.println(count);
	}
}
