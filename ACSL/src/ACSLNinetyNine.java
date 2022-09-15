import java.util.*;
import java.io.*;
public class ACSLNinetyNine {
	public static void main(String[] arsg) {
		Scanner in = new Scanner(System.in);
		
		int testCases = 5;
		
		for(int i = 0; i<5; i++) {
			String[] w = in.nextLine().split(", ");
			
			int[] array = new int[11];
			
			for(int r = 0; r<w.length; r++) {
				if(w[r].equals("T")) {
					array[r] = 10;
				}
				else if(w[r].equals("J")) {
					array[r] = 11;
				}
				else if(w[r].equals("Q")) {
					array[r] = 12;
				}
				else if(w[r].equals("K")) {
					array[r] = 13;
				}
				else if(w[r].equals("A")) {
					array[r] = 14;
				}
				else {
					array[r] = Integer.parseInt(w[r]);
				}
			}
			
			int stack = array[0];
			
			int[] player = new int[3];
			
			for(int r = 0; r<3; r++) {
				player[r] = array[r+1];
			}
			
			boolean playerTurn = true;
			
			for(int r = 4; r<array.length; r++) {
				if(playerTurn && stack <= 99) {
					int max = 0;
					int ind = 0;
					for(int c = 0; c<3; c++) {
						if(player[c] > max) {
							max = player[c];
							ind = c;
						}
					}
					
					stack += max;
					
					player[ind] = array[r];
					
					playerTurn = false;
				}
				else if(!playerTurn && stack<=99){
					stack += array[r];
					playerTurn = true;
				}
			}
			
			if(playerTurn) {
				System.out.println(stack + ", player");
			}
			else {
				System.out.println(stack + ", dealer");
			}
		}
	}
}
