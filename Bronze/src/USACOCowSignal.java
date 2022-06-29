import java.util.*;
import java.io.*;
public class USACOCowSignal {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("cowsignal.in"));
		PrintWriter out = new PrintWriter("cowsignal.out"); 
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int rows = Integer.parseInt(st.nextToken());
		int column = Integer.parseInt(st.nextToken());
		int scale = Integer.parseInt(st.nextToken());
		
		char[][] signal = new char[rows][column];
		
		for(int i = 0; i<rows; i++) {
			String n = in.readLine();
			for(int j = 0; j<column; j++) {
				signal[i][j] = n.charAt(j);
			}
		}
		
		for(int a = 0; a<rows; a++) {
			for(int b = 0; b<scale; b++) {
				for(int c = 0; c<column; c++) {
					for(int d = 0; d<scale; d++) {
						out.print(signal[a][c]);
					}
				}
				out.println();
			}
		}
		in.close();
		out.close();
	}
}
