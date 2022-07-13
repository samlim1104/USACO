import java.util.*;
import java.io.*;
public class USACOMilkPails {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("pails.in"));
		PrintWriter out = new PrintWriter("pails.out");
		
		int X = in.nextInt();
		int Y = in.nextInt();
		int M = in.nextInt();
		
		int Xmax = M/X;
		int Ymax = M/Y;
		
		int max = 0;
		
		for(int r = 0; r<=Ymax; r++) {
			for(int c = 0; c<=Xmax; c++) {
				if(Y * r + X * c <= M) {
					int temp = Y * r + X * c;
					max = Math.max(temp, max);
				}
			}
		}
		
		out.println(max);
		
		in.close();
		out.close();
	}
}
