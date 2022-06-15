import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			int number = Integer.parseInt(in.nextLine());
			
			if(number == 0 || number == 1) {
				System.out.println("TRUE");
			}
			
			ArrayList<Integer> fibonacci = new ArrayList<>();
			
			fibonacci.add(0);
			fibonacci.add(1);
			
			int index = 1;
			
			boolean result = false;
			
			while(number > fibonacci.get(index)) {
				index++;
				fibonacci.add(fibonacci.get(index-1) + fibonacci.get(index-2));
				
				
			}
			
			if(number == fibonacci.get(index)) {
				result = true;
			}
			
			if(result) {
				System.out.println("TRUE");
			}
			else {
				System.out.println("FALSE");
			}
		}
		in.close();
	}
}
