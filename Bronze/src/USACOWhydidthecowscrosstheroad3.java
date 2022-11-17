import java.io.*;
import java.util.*;
public class USACOWhydidthecowscrosstheroad3 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("cowqueue.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowqueue.out")));
		int N = Integer.parseInt(in.readLine());
		int[][] cows = new int[N][2];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			cows[i][0] = Integer.parseInt(st.nextToken());
			cows[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cows, (a, b) -> Integer.compare(a[0], b[0]));
		
		pw.println(solve(N, cows));
		pw.close();
	}
	public static int solve(int N, int[][] cows) {
		int end = cows[0][0] + cows[0][1];
		for(int i = 1; i < N; i++) {
			int tempEnd = 0;
			if(cows[i][0] - end > 0) {
				tempEnd = cows[i][0] - end;
			}
			end += tempEnd + cows[i][1];
		}
		
		return end;
	}
}