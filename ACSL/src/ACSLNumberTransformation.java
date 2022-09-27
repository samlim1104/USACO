import java.util.*;
public class ACSLNumberTransformation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			String[] booger = in.nextLine().split(" ");
			
			String num = booger[0];
			
			int ind = Integer.parseInt(booger[1]);
			ind = booger[0].length() - ind;
			
			int number = Integer.parseInt(booger[0].substring(ind, ind+1));
			
			String result = "";
			
			for(int a = 0; a<ind; a++) {
				int n = Integer.parseInt(num.substring(a, a+1)) + number;
				
				if(n > 9) {
					String m = String.valueOf(n);
					m = m.substring(m.length()-1, m.length());
					result += m;
				}
				else {
					String m = String.valueOf(n);
					result += m;
				}
			}
			
			result += num.substring(ind, ind+1);
			
			for(int a = ind+1; a<num.length(); a++) {
				int n = Math.abs(Integer.parseInt(num.substring(a, a+1)) - number);
				
				result += String.valueOf(n);
			}
			
			System.out.println(result);
			
		}
	}
}
