import java.io.*;
import java.util.*;
public class USACOOutOfPlace {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("outofplace.in"));
		PrintWriter out = new PrintWriter("outofplace.out");
		
		int n = in.nextInt();
		
		int[] array = new int[n];
		int[] sort = new int[n];
		
		for(int i = 0; i<n; i++) {
			array[i] = in.nextInt();
			sort[i] = array[i];
		}
		
		Arrays.sort(sort);
		
		int count = 0;
		
		for(int i = 0; i<n; i++) {
			if(array[i] != sort[i]) {
				count++;
			}
		}
		//
		
		
		out.println(count-1);
		
		in.close();
		out.close();
	}
}
