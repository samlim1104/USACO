import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			int number = Integer.parseInt(in.nextLine());
			
			if(number == 0) {
				System.out.println(0);
			}
			else {
			int product = 1;
			
			while(number > 1) {
				product *= number;
				number--;
			}
			
			System.out.println(product);
			}
		}
	}
}
