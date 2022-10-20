import java.util.*;
public class ACSLScrabble {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] input = in.nextLine().split(", ");
			
			int[] points = new int[4];
			
			for(int r = 0; r<4; r++) {
				if(input[r].equals("A") || input[r].equals("E")) {
					points[r] = 1;
				}
				if(input[r].equals("D") || input[r].equals("R")) {
					points[r] = 2;
				}
				if(input[r].equals("B") || input[r].equals("M")) {
					points[r] = 3;
				}
				if(input[r].equals("V") || input[r].equals("Y")) {
					points[r] = 4;
				}
				if(input[r].equals("J") || input[r].equals("X")) {
					points[r] = 8;
				}
			}
		
		for(int r = 0; r<5; r++) {
			int[] tiles = new int[4];
				
			String[] lmao = in.nextLine().split(", ");
			
			if(lmao[1].equals("V")) {
				tiles[0] = Integer.parseInt(lmao[0]);
				tiles[1] = tiles[0] + 10;
				tiles[2] = tiles[1] + 10;
				tiles[3] = tiles[2] + 10;
			}
			else if(lmao[1].equals("H")){
				tiles[0] = Integer.parseInt(lmao[0]);
				tiles[1] = tiles[0] + 1;
				tiles[2] = tiles[1]+1;
				tiles[3] = tiles[2]+1;
			}
			
			int[] p = new int[4];
			
			boolean d2 = false;
			boolean triple = false;
			
			for(int c = 0; c<4; c++) {
				if(tiles[c] % 3 == 0 && (tiles[c] / 3) % 2 == 1) {
					p[c] = points[c] * 2;
				} 
				else if(tiles[c] % 5 == 0) {
					p[c] = points[c] * 3;
				}
				else if(tiles[c] % 7 == 0) {
					p[c] = points[c];
					d2 = true;
				}
				else if(tiles[c] % 8 == 0) {
					p[c] = points[c];
					triple = true;
				}
				else {
					p[c] = points[c];
				}
			}
			
			int sum = 0;
			
			for(int x : p) {
				sum += x;
			}
			
			if(d2) {
				sum *= 2;
				System.out.println(sum);
			}
			else if(triple) {
				sum *= 3;
				System.out.println(sum);
			}
			else {
				System.out.println(sum);
			}
		}
	}
}