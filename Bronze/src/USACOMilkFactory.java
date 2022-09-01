import java.util.*;
import java.io.*;
public class USACOMilkFactory {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("factory.in"));
		PrintWriter out = new PrintWriter("factory.out");
		
		int n = in.nextInt();
		
		int[] outgoing = new int[n];
		
		for(int i = 0; i<n-1; i++) {
			outgoing[in.nextInt()-1]++;
		}
		
		int ans = -1;
		
		for(int i = 0; i<n; i++) {
			if(outgoing[i] == 0) {
				if(ans == -1) {
					ans = i + 1;
				}
				else {
					ans = -1;
					break;
				}
			}
		}
		
		out.println(ans);
		
		out.close();
	}
}
