import java.util.*;
import java.io.*;
public class USACOLifeGuards {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("lifeguards.in"));
		PrintWriter out = new PrintWriter("lifeguards.out");
		
		int n = Integer.parseInt(in.nextLine());
		
		int[] times = new int[1001];
		int[][] shift = new int[n][2];
		
		int totaltime = 0;
		
		int start = 0;
		int end = 0;
		
		for(int i = 0; i<n; i++) {
			start = in.nextInt();
			end = in.nextInt();
			
			shift[i][0] = start;
			shift[i][1] = end;
			
			for(int a = start; a<end; a++) {
				times[a]++;
				
				if(times[a] == 1) {
					totaltime++;
				}
			}
		}
		
		int max = 0;
		int tem = 0;
		
		
		for(int[] x : shift) {
			start = x[0];
			end = x[1];
			
			tem = totaltime;
			
			for(int r = start; r<end; r++) {
				if(times[r] == 1) {
					tem--;
				}
			}
			
			max = Math.max(max, tem);
		}
		
		out.println(max);
		
		in.close();
		out.close();
	}
}
