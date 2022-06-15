import java.io.*;
public class USACOTeleporter {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("teleport.in"));
		PrintWriter out = new PrintWriter("teleport.out");
		
		String[] input = in.readLine().split(" ");
		
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int x = Integer.parseInt(input[2]);
		int y = Integer.parseInt(input[3]);
		
		int result = Math.abs(a-b);
		result = Math.min(result, Math.abs(b-x) + Math.abs(a-y));
		result = Math.min(result, Math.abs(b-y) + Math.abs(a-x));
		
		out.print(result);
		
		in.close();
		out.close();
	}
}
