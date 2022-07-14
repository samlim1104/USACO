import java.util.*;
import java.io.*;
public class USACOCowGymnastics {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("gymnastics.in"));
		PrintWriter out = new PrintWriter("gymnastics.out");
		
		int K = in.nextInt();
		int N = in.nextInt();
		
		int[][] ranks = new int[K][N];
		
		for(int i = 0; i<K; i++) {
			for(int a = 0; a<N; a++) {
				ranks[i][a] = in.nextInt();
			}
		}
		
		int count = 0;
		
		for(int r = 0; r<N; r++) {
			int temp1 = ranks[0][r];
			for(int c = r+1; c<N; c++) {
				int temp2 = ranks[0][c];
				
				boolean value = true;
				
				for(int[] ran : ranks) {
					for(int a = 0; a<N; a++) {
						int index = 0;
						if(ran[a] == temp1) {
							value = false;
							index = a;
						}
						else if(ran[a] == temp2 && a > index) {
							value = true;
						}
					}
					if(value) {
						continue;
					}
					else {
						break;
					}
				}
				if(value) {
					count++;
				}
			}
		}
		
		out.println(count);
		
		in.close();
		out.close();
	}
}
