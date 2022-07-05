import java.util.*;
import java.io.*;
public class USACOBucketList {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("blist.in"));
		PrintWriter out = new PrintWriter("blist.out");
		
		int N = Integer.parseInt(in.nextLine());
		
		int[] line = new int[1000];
		
		for(int i = 0; i<N; i++) {
			
			int s = in.nextInt();
			int t = in.nextInt();
			int b = in.nextInt();
			
			for(int a = s; a<t; a++) {
				line[a] += b;
			}
		}
		
		int max = 0;
		
		for(int v = 0; v<line.length; v++) {
			max = Math.max(line[v], max);
		}
		
		out.println(max);
		
		in.close();
		out.close();
	}
}
