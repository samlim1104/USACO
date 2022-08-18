import java.util.*;
import java.io.*;
public class USACOWhereAmI {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("whereami.in"));
		PrintWriter out = new PrintWriter("whereami.out");
		
		int N = in.nextInt();
		String s = in.next();
		
		int ans = 0;
		loop:
		for (int a = 1; a <= N; a++) {
			HashSet <String> arr = new HashSet <String> ();
			
			for (int b = 0; b < N - a + 1; b++) {
				String part = "";
				for (int c = b; c < b + a; c++) {
					part += s.charAt(c);
				}
				
				if (arr.contains(part)) {
					continue loop;
				}
				else {
					arr.add(part);
				}
			}
			
			ans = a;
			break;
		}
		
		out.println(ans);
		out.close();
	}
}
