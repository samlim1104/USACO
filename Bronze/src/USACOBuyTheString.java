import java.util.*;
public class USACOBuyTheString {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			
			String[] nums = in.nextLine().split(" ");
			
			int p0 = Integer.parseInt(nums[1]);
			int p1 = Integer.parseInt(nums[2]);
			int h = Integer.parseInt(nums[3]);
			
			String binary = in.nextLine();
			
			int price = 0;
			
			for(int a = 0; a<binary.length(); a++) {
				if(binary.substring(a, a+1).equals("1")) {
					price += p1;
				}
				else if(binary.substring(a, a+1).equals("0")) {
					price += p0;
				}
			}
			
			int min = 0;
			
			if(p0 == p1) {
				min = p0;
			}
			else {
				min = Math.min(p0, p1);
			}
			
			int m = 0;
			
			if(min == p0) {
				for(int q = 0; q<binary.length(); q++) {
					if(binary.substring(q, q+1).equals("1")) {
						m += p0;
						m += h;
					}
					else {
						m+=p0;
					}
				}
			}
			else if(min == p1) {
				for(int q = 0; q<binary.length(); q++) {
					if(binary.substring(q, q+1).equals("0")) {
						m += p1;
						m += h;
					}
					else {
						m+=p1;
					}
				}
			}
			
			System.out.println(Math.min(price, m));
		}
		
		in.close();
	}
}
