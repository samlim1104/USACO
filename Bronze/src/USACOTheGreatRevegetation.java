import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class USACOTheGreatRevegetation {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("revegetate.in"));
		PrintWriter out = new PrintWriter("revegetate.out"); 
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[] array = new int[n];
		
		ArrayList<ArrayList<Integer>> pastures = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			pastures.add(new ArrayList<>());
		}
		
		for(int i = 0; i<m; i++) {
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			
			pastures.get(a).add(b);
			pastures.get(b).add(a);
			
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println(pastures.get(i).toString());
		}
		
		for(int i = 0; i<n; i++) {
			array[i]++;
		}
		
		for(int i = 0; i<n; i++) {
			for(int r = 0; r<pastures.get(i).size(); r++) {
				int y = pastures.get(i).get(r);
				if(array[i] == array[y]) {
					if(array[y] + 1 < 5) {
						array[y]++;
					}
					else {
						array[i]++;
					}
				}
			}
		}
		
		for(int i : array) {
			out.print(i);
		}
		
		out.close();
	}
}
