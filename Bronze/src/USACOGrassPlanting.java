import java.io.*;
import java.util.*;
public class USACOGrassPlanting {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("planting.in"));
		PrintWriter out = new PrintWriter("planting.out");
		
		int n = in.nextInt();
		
		int[] array = new int[n];
		
		int count = 0;
		
		int min = 0;
		
		for(int i = 0; i<n-1; i++) {
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			
			array[a]++;
			array[b]++;
			
			min = Math.max(min, array[a]);
			min = Math.max(min, array[b]);
		}
		
		out.println(min+1);
		
		in.close();
		out.close();
	}
}
