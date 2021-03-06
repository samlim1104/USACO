import java.io.*;
import java.util.*;
public class USACOShellGame {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("shell.in"));
		PrintWriter out = new PrintWriter("shell.out");
		
		int swaps = in.nextInt();
		
		int[] shellPosition = new int[3];
		int[] guess = new int[3];
		
		shellPosition[0] = 0;
		shellPosition[1] = 1;
		shellPosition[2] = 2;
		
		for(int i = 0; i<swaps; i++) {
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			int g = in.nextInt()-1;
			
			int t = shellPosition[a];
			shellPosition[a] = shellPosition[b];
			shellPosition[b] = t;
			
			guess[shellPosition[g]]++;
		}
		
		out.println(Math.max(guess[0], Math.max(guess[1], guess[2])));
		in.close();
		out.close();
	}
}
