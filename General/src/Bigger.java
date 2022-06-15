import java.util.*;
public class Bigger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			String[] s = in.nextLine().split(" ");
			
			int[] nums = new int[s.length];
			
			for(int t = 0; t<s.length; t++) {
				nums[t] = Integer.parseInt(s[t]);
			}
			
			int temp = Integer.MIN_VALUE;
			
			for(int q = 0; q<nums.length; q++) {
				if(nums[q] > temp) {
					temp = nums[q];
				}
			}
			
			System.out.println(temp);
		}
	}
}
