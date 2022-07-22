import java.util.*;
import java.io.*;
public class USACOBovineGenomicsSilver {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("cownomics.in"));
		PrintWriter out = new PrintWriter("cownomics.out"); 
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		String[] spotted = new String[n];
		String[] plain = new String[n];
		
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			spotted[i] = st.nextToken();
		}
		
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(in.readLine());
			plain[i] = st.nextToken();
		}
		
		int max = 0;
		
		for(int a = 0; a<m; a++) {
			for(int b = a+1; b<m; b++) {
				c:
				for(int c= b+1; c<m; c++) {
					for(String spot : spotted) {
						for(String pla : plain) {
							if(pla.charAt(a) == spot.charAt(a) && pla.charAt(b) == spot.charAt(b) && pla.charAt(c) == spot.charAt(c)){
								continue c;
							}
						}
					}
					max++;
				}
			}
		}
		
		out.println(max);
		
		in.close();
		out.close();
	}
}
