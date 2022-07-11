import java.util.*;
import java.io.*;
public class USACOCensoring {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("censor.in"));
		PrintWriter out = new PrintWriter("censor.out"); 
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		String S = st.nextToken();
		StringTokenizer s = new StringTokenizer(in.readLine());
		String T = s.nextToken();
		
		StringBuilder ans = new StringBuilder();

		for(int i = 0; i<S.length(); i++) {
			ans.append(S.charAt(i));
			if(ans.length() >= T.length() && ans.substring(ans.length()-T.length(), ans.length()).equals(T)) {
				ans.delete(ans.length()-T.length(), ans.length());
			}
		}
		
		out.print(ans);

		out.close();
	}
}
