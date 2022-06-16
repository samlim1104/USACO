import java.util.*;
public class ChangeWorld {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			
			String w = in.nextLine();
			String[] word = new String[2];
			word[0] = w.substring(1, w.indexOf("."));
			word[1] = w.substring(w.indexOf(".") + 1, w.length());
			
			String dollars = word[0] + "." + word[1];
			
			int bucks = Integer.parseInt(word[0]);
			
			int cents = bucks * 100 + Integer.parseInt(word[1]);
			
			int quarters = 0;
			int dimes = 0;
			int nickels = 0;
			int pennies = 0;
			 
			quarters = cents / 25;
			
			cents = cents % 25;
			
			dimes = cents / 10;
			
			cents = cents % 10;
			
			nickels = cents /5;
			
			cents = cents%5;
			
			pennies = cents;
			
			System.out.println("$" + dollars);
			System.out.println("Quarters=" + quarters);
			System.out.println("Dimes=" + dimes);
			System.out.println("Nickels=" + nickels);
			System.out.println("Pennies=" + pennies);
			
		}
	}
}
