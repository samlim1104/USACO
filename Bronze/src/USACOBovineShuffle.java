import java.io.*;
import java.util.*;
public class USACOBovineShuffle {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("shuffle.in"));
		PrintWriter out = new PrintWriter("shuffle.out");
		
		int N = in.nextInt();
		
		int[] shuffle = new int[N];
		int[] order = new int[N];
		int[] newOrder = new int[N];
		
		for(int i = 0; i<N; i++) {
			shuffle[i] = in.nextInt();
		}
		
		for(int i = 0; i<N; i++) {
			order[i] = in.nextInt();
		}
		
		for(int i = 0; i<3; i++) {
		for(int a = 0; a<N; a++) {
			newOrder[a] = order[shuffle[a]-1];
		}
		order = newOrder.clone();
		}
		
		for(int f : newOrder) {
			out.println(f);
		}
		
		in.close();
		out.close();
	}
}
