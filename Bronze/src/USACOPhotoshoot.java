import java.util.*;
import java.io.*;
public class USACOPhotoshoot {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String word = in.next();
		
		char[] array = new char[20001];
		
		for(int i = 0; i<n; i++) {
			array[i] = word.charAt(i);
		}
		
		int count = 0;
		
		for(int i = n-1; i>=1; i-=2) {
			if(array[i] == array[i-1]) {
				continue;
			}
			if(array[i] == 'G' && count % 2 == 1) {
				count++;
			}
			if(array[i] == 'H' && count%2 == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
