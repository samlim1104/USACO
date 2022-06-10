import java.util.*;
public class BrickHouse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			String[] s = in.nextLine().split(" ");
			
			int[] nums = new int[s.length];
			for(int a = 0; a<s.length; a++) {
				nums[a] = Integer.parseInt(s[a]);
			}
			int numOfOnes = nums[0];
			int numOfFives = nums[1];
			int goal = nums[2];
			
			int totalNumOfFives = numOfFives * 5;
			
			if(totalNumOfFives >= goal) {
				if(goal % 5 <= numOfOnes) {
					System.out.println(true);
				}
			}
			else if(goal % 5 <= numOfOnes) {
				System.out.println(true);
			}
			else if(goal == 0) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
	}
}
