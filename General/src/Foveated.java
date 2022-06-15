import java.util.*;
public class Foveated {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			int[][] picture = new int[20][20];
			
			String[] d = in.nextLine().split(" ");
			
			int row = Integer.parseInt(d[0]);
			int column = Integer.parseInt(d[1]);
			
			if(row == 0) {
				for(int r = 0; r<picture.length; r++) {
					for(int c = 0; c<picture[0].length; c++) {
						if(r <= row+2 && c<=column+2) {
							
						}
				}
				}
			}
		}
	}
}
