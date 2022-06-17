import java.util.*;
public class Fibonnaci1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			
			int position = Integer.parseInt(in.nextLine());
			
			ArrayList<Integer> fibonacci = new ArrayList<>();
			
			fibonacci.add(0);
			fibonacci.add(1);
			
			int index = 0;
			
			int value = 0;
			
			while(index < position) {
				value = fibonacci.get(index);
				index++;
				fibonacci.add(fibonacci.get(index-1) + fibonacci.get(index));
			}
			
			System.out.println(position + " = " + value);
		}
	}
}
