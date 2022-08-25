import java.util.*;
import java.io.*;
public class USACOCowTipping {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("cowtip.in"));
		PrintWriter out = new PrintWriter("cowtip.out");
		
		int n = in.nextInt();
		
		char[][] array = new char[n][n];

		for(int i = 0; i<n; i++){
			array[i] = in.next().toCharArray();
		}
		
		int count = 0;
		
		for(int i = n-1; i>=0; i--) {
			for(int a = n-1; a>=0; a--) {
				if(array[i][a] == '1') {
					count++;
					for(int r = i; r>=0; r--) {
						for(int c = a; c>=0; c--) {
							if(array[r][c] == '1') {
								array[r][c] = '0';
							}
							else {
								array[r][c] = '1';
							}
						}
					}
				}
			}
		}
		
		out.println(count);
		in.close();
		out.close();
	}
}
