import java.util.*;
import java.io.*;
public class USACOEvenMoreOddPhotos {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i<n; i++) {
			array[i] = in.nextInt();
		}
		
		int numE = 0;
		int numO = 0;
		
		for(int i = 0; i<n; i++) {
			if(array[i] % 2 == 1) {
				numO++;
			}
			else {
				numE++;
			}
		}
		
		while(numO > numE) {
			numO = numO-2;
			numE++;
		}
		if(numE > numO +1) {
			numE = numO + 1;
		}
		
		System.out.println(numE + numO);
	}
}
