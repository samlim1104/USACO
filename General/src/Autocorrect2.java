import java.util.*;
public class Autocorrect2 {
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
			
			int indexOfCorrectWord = 0;
			for(int s = 0; s<incorrectlySpelled; s++) {
				
				String incorrectWord = in.nextLine();
				int temporaryMisspelled = incorrectWord.length();
				
				for(int e = 0; e<correctlySpelled; e++) {
					
					int misspelledLetters = 0;
					
					if(correctWords[e].length() == incorrectWord.length()) {
						for(int t = 0; t<incorrectWord.length(); t++) {
							if(!incorrectWord.substring(t, t+1).equals(correctWords[e].substring(t, t+1))) {
								misspelledLetters++;
							}
						}
						if(misspelledLetters < temporaryMisspelled) {
							temporaryMisspelled = misspelledLetters;
							indexOfCorrectWord = e;
						}
					}
					
				}
				
				System.out.println(correctWords[indexOfCorrectWord]);
			}
		}
	}
}
