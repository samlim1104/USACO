import java.util.*;
import java.io.*;
public class USACODiamondCollector {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("diamond.in"));
		PrintWriter out = new PrintWriter("diamond.out");
		
		int N = in.nextInt();
		int K = in.nextInt();
		
ArrayList<Integer> n = new ArrayList<>();
		for(int i = 0; i<N; i++) {
			n.add(in.nextInt());
		}
		
		Collections.sort(n);
		
		int count = 1;
		int max = 0;
		
		for(int a = 0; a<N; a++) {
			count = 1;
			for(int r = a+1; r<N; r++) {
				if(Math.abs(n.get(a) - n.get(r)) <= K) {
					count++;
				}
			}
			max = Math.max(count, max);
		}
		
		out.println(max);
		
		in.close();
		out.close();
	}
}
