import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class USACOWordProcessor {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("word.in"));
		PrintWriter out = new PrintWriter("word.out");
		
		String[] s = in.readLine().split(" ");
		
		int words = Integer.parseInt(s[0]);
		int numCharacters = Integer.parseInt(s[1]);
		
		String[] word = in.readLine().split(" ");
		
		int index = 0;
		
		while(index < words) {
			int character = 0;
			out.print(word[index]);
			character = word[index].length();
			index++;
			
			while(index < words && character + word[index].length() <= numCharacters) {
				out.print(" " + word[index]);
				character += word[index].length();
				index++;
			}
			
			if(index < words) {
				out.println();
			}
}
		in.close();
		out.close();
}
}