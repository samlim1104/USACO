import java.util.*;

public class ACSLStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] input = in.nextLine().split(", ");
			
		int split = Integer.parseInt(input[1]);
		
		String r = "";
		
		for(int i = 0; i<input[0].length(); i++) {
			if(i==0 || i % split != 0) {
				r += input[0].substring(i, i+1);
			}
			else {
				r += input[2] + input[0].substring(i, i+1);
			}
		}
		
		System.out.println(r);
		
		String[] i2 = in.nextLine().split(", ");
		
		String rr = i2[0];
		
		while(rr.indexOf(i2[1]) > 0) {
			rr = rr.substring(0, rr.indexOf(i2[1])) + rr.substring(rr.indexOf(i2[1]) + i2[1].length(), rr.length());
		}
		
		System.out.println(rr);
		
		String[] i3 = in.nextLine().split(", ");
		
		int n = i3[0].indexOf(i3[1]);
		
		System.out.println(i3[0].substring(0, n));
		
		String[] i4 = in.nextLine().split(", ");
		dd;
	}
}
