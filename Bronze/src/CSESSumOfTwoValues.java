import java.util.*;
import java.io.*;
public class CSESSumOfTwoValues {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int sum = in.nextInt();
		int[] values = new int[n];
		
		Map<Integer, Integer> m = new HashMap<>();
		for(int i = 0; i<n; i++) {
			values[i] = in.nextInt();
		}
		
		for(int i = 0; i<n; i++) {
			if(m.containsKey(sum - values[i])) {
				System.out.println((i+1) + " " + m.get(sum - values[i]));
				return;
			}
			m.put(values[i], i+1);
		}
		System.out.println("IMPOSSIBLE");
	}
}
