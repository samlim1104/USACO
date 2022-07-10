import java.util.*;
import java.io.*;
public class USACOMowingTheField {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("mowing.in"));
		PrintWriter out = new PrintWriter("mowing.out");  
		
		int N = Integer.parseInt(in.nextLine());
		
		int x = 0;
		int y = 0;
		
		ArrayList<Integer> xs = new ArrayList<>();
		ArrayList<Integer> ys = new ArrayList<>();
		
		for(int i = 0; i<N; i++) {
			String D = in.next();
			int S = in.nextInt();
			
			for(int a = 0; a<S; a++) {
				if(D.equals("N")) {
					y++;
				}
				if(D.equals("S")) {
					y--;
				}
				if(D.equals("W")) {
					x--;
				}
				if(D.equals("E")) {
					x++;
				}
				
				xs.add(x);
				ys.add(y);
			}
		}
		
		int max = -1;
		
		for(int s = 0; s<xs.size()-1; s++) {
			int xx = xs.get(s);
			int yy = ys.get(s);
			
			for(int f = s+1; f<xs.size(); f++) {
				if(xx == xs.get(f) && yy == ys.get(f)) {
					if(max == -1 || f-s < max) {
						max = f-s;
					}
				}
			}
		}
		
		out.println(max);
		
		in.close();
		out.close();
	}
}
