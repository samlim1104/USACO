
import java.util.Scanner;
public class AEIOU {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			int testCases = Integer.parseInt(in.nextLine());
			
		for(int i = 0; i<testCases; i++) {
			String[] input = in.nextLine().split(" ");
			int count = 0;
			for(int s = 0; s<input.length; s++) {
				for(int g = 0; g<input[s].length(); g++) {
					if(input[s].charAt(g) == 97 || input[s].charAt(g) == 101 || input[s].charAt(g) == 105 || input[s].charAt(g) == 111 || input[s].charAt(g) == 117) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		
		
		}
				
				
	}
}
