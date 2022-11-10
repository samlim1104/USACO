import java.util.*;

public class ACSLAscending {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			String input = in.next();
			
			int index = Integer.parseInt(input.substring(0, 1));
			
			String result = input.substring(1, 1+index);
			
			int sub = result.length() + 1;
			
			String add = "";
			int before = Integer.parseInt(result);
			
			for(int r = input.length(); r>sub; r--) {
				add += input.substring(r-1, r);
				if(Integer.parseInt(add) > before) {
					result += " " + add;
					before = Integer.parseInt(add);
					add = "";
				}
			}
			
			System.out.println(result);
		}
		
		
	}
}
