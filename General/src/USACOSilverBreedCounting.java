import java.util.*;
import java.io.*;
public class USACOSilverBreedCounting {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("bcount.in"));
		PrintWriter out = new PrintWriter("bcount.out"); 
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		int[] IDs = new int[N];
		
		for(int i = 0; i<N; i++) {
			IDs[i] = Integer.parseInt(in.readLine());
		}
		
		for(int a = 0; a<Q; a++) {
			st = new StringTokenizer(in.readLine());
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken());
			
			int H = 0;
			int G = 0;
			int J = 0;
			
			for(int u = start; u<end; u++) {
				if(IDs[u] == 1) {
					H++;
				}
				if(IDs[u] == 2) {
					G++;
				}
				if(IDs[u] == 3) {
					J++;
				}
			}
			
			out.println(H + " " + G + " " + J);
		}
		
		in.close();
		out.close();
	}
}
