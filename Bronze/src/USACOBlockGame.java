import java.util.*;
import java.io.*;
public class USACOBlockGame {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("blocks.in"));
		PrintWriter out = new PrintWriter("blocks.out");
		
		int N = Integer.parseInt(in.nextLine());
		int result[] = new int[26];
		
		for(int i = 0; i<N; i++) {
			int[] freq1 = new int[26];
			int[] freq2 = new int[26];
			
			String word1 = in.next();
			
			for(int a = 0; a<word1.length(); a++) {
				freq1[(int) word1.charAt(a) - 97]++;
			}
			
			String word2 = in.next();
			for(int a = 0; a<word2.length(); a++) {
				freq2[(int) word2.charAt(a) - 97]++;
			}
			
			for(int q = 0; q<26; q++) {
				result[q] += Math.max(freq1[q], freq2[q]);
			}
		}
		
		for(int a : result) {
			out.println(a);
		}
		in.close();
		out.close();
	}
}
