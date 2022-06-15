import java.util.*;
public class ChangeWorld {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			String w = in.nextLine();
			
			double a = Double.parseDouble(w.substring(1, w.length()));
			double dollars = a;
			int amount = (int) (a * 100);
			
			int quarters = amount / 25;
			
			amount = amount % 25;
			
			int dimes = amount / 10;
			
			amount = amount % 10;
			
			int nickels = amount / 5;
			
			amount = amount % 5;
			
			int penny = amount;
			
			System.out.println("$" + dollars);
			System.out.println("Quarters=" + quarters);
			System.out.println("Dimes=" + dimes);
			System.out.println("Nickels=" + nickels);
			System.out.println("Pennies=" + penny);
		}
	}
}
