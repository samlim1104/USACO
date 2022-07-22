import java.util.*;
import java.io.*;

public class USACOGuessTheAnimal {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("guess.in"));
		PrintWriter out = new PrintWriter("guess.out");
		
		int n = Integer.parseInt(in.nextLine());
		
		String[] animals = new String[n];
		
		ArrayList<ArrayList<String>> charac = new ArrayList<>();
		
		for(int i =0; i<n; i++) {
			animals[i] = in.next();
			
			int c = in.nextInt();
			
			ArrayList<String> f = new ArrayList<>();
			
			for(int r = 0; r<c; r++) {
				f.add(in.next());
			}
			
			charac.add(f);
		}
		
		int max = 0;
		
		for(int h = 0; h<n-1; h++) {
			for(int w = h+1; w<n; w++) {
				int count = 0;
				for(int d = 0; d<charac.get(h).size(); d++) {
					if(charac.get(w).contains(charac.get(h).get(d))) {
						count++;
					}
				}
				
				max = Math.max(max, count+1);
			}
		}
		
		out.println(max);
		
		in.close();
		out.close();
	}
}
