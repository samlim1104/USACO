import java.util.*;
import java.io.*;
public class USACOBovineGenomics {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("cownomics.in"));
		PrintWriter out = new PrintWriter("cownomics.out");
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		String[][] spot = new String[n][m];
		String[][] norm = new String[n][m];
		
		for(int i = 0; i<n; i++) {
			String a = in.next();
			for(int r =0; r<m; r++) {
				spot[i][r] = a.substring(r, r+1);
			}
		}
		
		for(int i = 0; i<n; i++) {
			String a = in.next();
			for(int r =0; r<m; r++) {
				norm[i][r] = a.substring(r, r+1);
			}
		}
		
		int count = 0;
		
		for(int c = 0; c<m; c++) {
			ArrayList<String> a = new ArrayList<>();
			for(int r =0; r<n; r++) {
				String letter = spot[r][c];
				
				if(!a.contains(letter)) {
					a.add(letter);
				}
				
			}
			
			boolean f = false;
			
			for(int r = 0; r<n; r++) {
				String letter = norm[r][c];
				
				if(a.contains(letter)) {
					f = true;
				}
			}
			
			if(!f) {
				count++;
			}
		}
		
		out.println(count);
		
		in.close();
		out.close();
	}
}
