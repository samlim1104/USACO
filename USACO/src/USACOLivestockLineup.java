import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class USACOLivestockLineup {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("buckets.in"));
		PrintWriter out = new PrintWriter("buckets.out"); 
		
		int testCases = Integer.parseInt(in.readLine());
		
		String[] order = new String[8];
		
		for(int i = 0; i<testCases; i++) {
			String[] sentence = in.readLine().split(" ");
			
			String first = sentence[0];
			String second = sentence[sentence.length-1];
			
			
		}
	}
}
