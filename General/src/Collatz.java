import java.util.*;
public class Collatz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			int n = Integer.parseInt(in.nextLine());
			
			int number = n;
			int count = 1;
			
			while(number > 1) {
				if(number % 2 == 0) {
					number /= 2;
					count++;
				}
				else if(number % 2 == 1) {
					number = number * 3 + 1;
					count++;
				}
			}
			
			System.out.println(n + ":" + count);
		}
	}
}
