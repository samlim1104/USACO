import java.util.*;
import java.io.*;

public class USACOGuessTheAnimal {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");
		
		int n = Integer.parseInt(in.nextLine());
		
		String[] animals = new String[n];
		int[] numc = new int[n];
		
		int[] charac = new int[26];
		ArrayList<String> ch = new ArrayList<>();
		
		for(int i =0; i<n; i++) {
			animals[i] = in.next();
			
			int c = in.nextInt();
			numc[i] = c;
			
			for(int r = 0; r<c; r++) {
				String cha = in.next();
				
				charac[cha.charAt(0) - 97]++;
				ch.add(cha);
			}
		}
		
		int max = 0;
		
		for(int a = 0; a<n; a++) {
			int temp = 0;
			int y = numc[a];
			for(int j =0; j<y; j++) {
				System.out.println(charac[ch.get(j).charAt(0) - 97]);
				if(charac[ch.get(j).charAt(0) - 97] > 1) {
					temp++;
				}
				y--;
				j--;
			}
			max = Math.max(temp+1, max);
		}
		
		System.out.println(max);
	}
}
