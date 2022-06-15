
import java.util.ArrayList;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			int testCases = Integer.parseInt(in.nextLine());
			
			for(int i = 0; i<testCases; i++) {
				
				String[] input = in.nextLine().split("\\|");
				
				String first = input[0];
				String second = input[1];
				ArrayList<String> letters = new ArrayList<>();
				for(int c = 0; c<second.length(); c++) {
					letters.add(second.substring(c, c+1));
				}
				
				boolean result = true;
				
				if(first.equals(second)) {
					result = false;
				}
				else{
					for(int g = 0; g<first.length(); g++) {
						for(int f = 0; f<letters.size(); f++) {
							if(first.substring(g, g+1).equals(letters.get(f))) {
								letters.remove(f);
							}
						}
					}
					if(letters.size() == 0) {
						result = true;
					}
					else {
						result = false;
					}
				}
				
				if(result) {
					System.out.println(first + "|" + second + " = ANAGRAM");
				}
				else {
					System.out.println(first + "|" + second + " = NOT AN ANAGRAM");
				}
			}
		}
	}
}
