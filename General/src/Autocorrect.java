
import java.util.*;
public class Autocorrect {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			String[] words = in.nextLine().split(" ");
			
			int correctlySpelled = Integer.parseInt(words[0]);
			int incorrectlySpelled = Integer.parseInt(words[1]);
			
			String[] correctWords = new String[correctlySpelled];
			
			for(int c = 0; c<correctlySpelled; c++) {
				correctWords[c] = in.nextLine();
			}
			
			for(int s = 0; s<incorrectlySpelled; s++) {
				String scramble = in.nextLine();
				int wordLength = scramble.length();
				
				for(int a = 0; a<correctlySpelled; a++) {
					if(correctWords[a].length() == scramble.length()) {
						System.out.println(correctWords[a]);
					}
				}
			}
		}
	}
}
