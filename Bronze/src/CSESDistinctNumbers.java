import java.util.*;
import java.io.*;
public class CSESDistinctNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i<N; i++) {
			set.add(in.nextInt());
		}
		
		System.out.print(set.size());
	}
}
