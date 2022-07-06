import java.util.*;
import java.io.*;

public class USACOCircularBarn {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("cbarn.in"));
		PrintWriter out = new PrintWriter("cbarn.out"); 
		
		int rooms = Integer.parseInt(in.nextLine());
		
		int[] capacities = new int[rooms];
		
		for(int a=0; a<rooms; a++) {
			capacities[a] = in.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i<rooms; i++) {
			int t = 0;
			int cow = 0;
			int c = i;
			for(int b = 0; b<rooms; b++) {
				
				if(c == rooms) {
					c = 0;
				}
				
				t+=capacities[c] * cow;
				cow++;
				c++;
			}
			
			min = Math.min(t, min);
		}
		
		out.println(min);
		
		in.close();
		out.close();
	}
}
