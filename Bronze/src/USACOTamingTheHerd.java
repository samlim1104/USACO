import java.util.*;
import java.io.*;
public class USACOTamingTheHerd {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("taming.in"));
		PrintWriter out = new PrintWriter("taming.out");
		
		int n = in.nextInt();
		
		int[] array = new int[n];
		
		for(int i =0; i<n; i++) {
			array[i] = in.nextInt();
		}
		
		boolean streak = true;
		boolean result = true;
		
		if(array[0] != 0 && array[0] != -1) {
			out.println(-1);
			out.close();
		}
		
		array[0] = 0;
		
		for(int i = n-1; i>0; i--) {
			if(i == n-1 && array[i] <= 0) {
				streak = false;
			}
			int b = array[i]-1;
			if(streak) {
				if(array[i] == 1 && array[i-1] == -1) {
					array[i-1] = 0;
					streak = false;
				}
				else if(array[i-1] == 0 && b == 0) {
					streak = false;
				}
				else if(array[i-1] == b) {
					continue;
				}
				else if(array[i-1] == -1){
					array[i-1] = b;
				}
				else {
					out.println(-1);
					out.close();
				}
			}
			else {
				if(array[i-1] > 0) {
					streak = true;
				}
			}
		}
		
		int min = 0;
		
		for(int i = 0; i<n; i++) {
			if(array[i] == 0) {
				min++;
			}
		}
		
		int max = 0;
		
		for(int i = 0; i<n; i++) {
			if(array[i] == 0 || array[i] == -1) {
				max++;
			}
		}
		
		out.println(min + " " + max);
		
		out.close();
	}
}
