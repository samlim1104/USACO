import java.io.*;
import java.util.*;
public class USACOBovineShuffle {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("shuffle.in"));
		PrintWriter out = new PrintWriter("shuffle.out");
		
		int N = in.nextInt();
		
		int[] order = new int[N];
		int[] id = new int[N];
		
		for(int i = 0; i<N; i++) {
			order[i] = in.nextInt();
		}
		
		for(int i = 0; i<N; i++) {
			id[i] = in.nextInt();
		}
		
		int count = 1;
		for(int a = 0; a<N; a++) {
			int t = 0;
			int c = 0;
			for(int b = 0; b<N; b++) {
				if(order[b] == count) {
					t = id[b];
					id[b] = id[a];
					id[a] = t;
					
					c = order[b];
					order[b] = order[a];
					order[a] = c;
				}
			}
			count++;
		}
		
		for(int f : id) {
			out.println(f);
		}
		
		in.close();
		out.close();
	}
}
