import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class USACOBucketBrigade {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("buckets.in"));
		PrintWriter out = new PrintWriter("buckets.out"); 
		
		int rx = 0;
		int ry = 0;
		int lx =0;
		int ly = 0;
		int bx = 0;
		int by = 0;
		
		for(int i = 0; i<10; i++) {
			String array = in.readLine();
			
			for(int a = 0; a<array.length(); a++) {
				if(array.substring(a, a+1).equals("B")) {
					bx = a;
					by = i;
				}
				else if(array.substring(a, a+1).equals("R")) {
					rx = a;
					ry = i;
				}
				else if(array.substring(a, a+1).equals("L")) {
					lx = a;
					ly = i;
				}
			}
		}
		
		if(rx == bx && rx == lx && ((ry < by && ry > ly) || (ry > by && ry < ly))){
			out.println(Math.abs(by - ly) + 1);
		}
		else if(ry == by && ry == ly && ((rx > bx && rx < lx) || (rx < bx && rx > lx))) {
			out.println(Math.abs(bx - lx) + 1);
		}
		else {
			out.println(Math.abs(bx-lx) + Math.abs(by-ly) - 1);
		}
		in.close();
		out.close();
	}
}
