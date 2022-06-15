

import java.util.Scanner;
public class Prob02 {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			int testCases = Integer.parseInt(in.nextLine());
			
			for(int i = 0; i<testCases; i++) {
				
				String[] input = in.nextLine().split(" ");
				
				int first = Integer.parseInt(input[0]);
				int second = Integer.parseInt(input[1]);
				
				System.out.println(first + second + " " + first * second);
			}
		}
	}

}
