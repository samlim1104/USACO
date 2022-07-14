import java.util.*;
import java.io.*;
public class USACOCountingLiars {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = Integer.parseInt(in.nextLine());

		int ans = N;
		
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> value = new ArrayList<>();
		
		for(int q = 0; q<N; q++) {
			String[] f = in.nextLine().split(" ");
			name.add(f[0]);
			value.add(Integer.parseInt(f[1]));
		}
		
		for(int i = 0; i<N; i++) {
			int count = 0;
			for(int j = 0; j<N; j++) {
				if((name.get(j).equals("L") && value.get(i) > value.get(j)) || (name.get(j).equals("G") && value.get(i) < value.get(j))) {
					count++;
				}
			}
			ans = Math.min(ans, count);
		}
		
		System.out.println(ans);
	}
}
