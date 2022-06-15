

import java.util.Scanner;

public class Prob01 {
	
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)){
			
			int testCases = Integer.parseInt(input.nextLine());
			
			for(int testcase = 0; testcase < testCases; testcase++) {
				String[] inputs = input.nextLine().split(":");
				
				double velocity = Double.parseDouble(inputs[0]);
				double distance = Double.parseDouble(inputs[1]);
				
				if(velocity >= distance) {
					System.out.println("SWERVE");
				}
				else if(5 * velocity >= distance) {
					System.out.println("BRAKE");
				}
				else {
					System.out.println("SAFE");
				}
			}
		}
	}
}