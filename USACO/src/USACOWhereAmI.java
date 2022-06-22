import java.io.*;
public class USACOWhereAmI {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");  
		
		int result = 1;
		
		int houses = Integer.parseInt(in.readLine());
		
		String colors = in.readLine();
		
		while(result < houses) {
			String index = colors.substring(0, result);
			String rest = colors.substring(result);
			if(rest.indexOf(index) >= 0) {
				result++;
			}
		}
		
		out.print(result);
	}
}
