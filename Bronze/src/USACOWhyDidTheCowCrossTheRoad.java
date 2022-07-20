import java.util.*;
import java.io.*;
public class USACOWhyDidTheCowCrossTheRoad {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("circlecross.in"));
		PrintWriter out = new PrintWriter("circlecross.out");
		
		String cows = in.nextLine();
		
		ArrayList<String> list = new ArrayList<>();
		
		int count = 0;
		
		for(int r = 0; r<52; r++) {
			String index = cows.substring(r, r+1);
			int a = r;
			int b = 0;
			for(int c = r+1; c<52; c++) {
				if(cows.substring(c, c+1).equals(index)) {
					b = c;
					break;
				}
			}
			
			for(int i = b+1; i<cows.length(); i++) {
				String ind = cows.substring(i, i+1);
				
				if(cows.indexOf(ind) > a && cows.indexOf(ind) < b) {
					count++;
				}
			}
		}
		
		out.println(count);
		
		in.close();
		out.close();
	}
}
