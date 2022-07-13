import java.util.*;
import java.io.*;
public class USACODaisyChains {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		ArrayList<Integer> petals = new ArrayList<>();
		
		for(int i = 0; i<N;i++) {
			petals.add(in.nextInt());
		}
		
		int count = 0;
		double t = 0;
		
		for(int r = 0; r<N; r++) {
			for(int c = r; c<N; c++) {
				
				t = 0;
				
				for(int a = r; a<=c; a++) {
					t += petals.get(a);
				}
				
				t = t / (c-r+1);
				
				for(int e = r; e<=c; e++) {
					if(petals.get(e) == t) {
						count++;
						break;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
