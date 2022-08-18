import java.util.*;
import java.io.*;
public class USACOSleepyCowSorting {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("sleepy.in"));
		PrintWriter out = new PrintWriter("sleepy.out");
		
		int n = in.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i<n; i++) {
			array[i] = in.nextInt();
		}

		boolean result = false;
		
		for(int a = array.length-1; a>=1; a--) {
			if(array[a-1] > array[a]) {
				result = true;
				out.println(a);
				break;
			}
		}
		
		if(!result) {
			out.println(0);
		}
		out.close();
in.close();
	}
}
