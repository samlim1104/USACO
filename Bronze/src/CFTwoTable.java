import java.util.*;
public class CFTwoTable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		
		for(int i = 0; i<testCases; i++) {
			int width = in.nextInt();
			int height = in.nextInt();
			
			int t1BLx = in.nextInt();
			int t1BLy = in.nextInt();
			int t1TRx = in.nextInt();
			int t1TRy = in.nextInt();
			
			int t2w = t1TRx - t1BLx;
			int t2h = t1TRy - t1BLy;
			
			int tableW = in.nextInt();
			int tableH = in.nextInt();
			
			boolean possible = false;
			int m = Integer.MAX_VALUE;
			
			if(height - tableH >= t2h) {
				possible = true;
				int biggest = Math.max(t1BLy, height - t1TRy);
				m = Math.min(tableH - biggest, m);
			}
			if(width - tableW >= t2w) {
				possible = true;
				int biggest = Math.max(t1BLx, width - t1TRx);
				m = Math.min(tableW - biggest, m);
			}
			
			m = Math.max(m, 0);
			
			if(possible == false) {
				System.out.println(-1);
			}
			else {
				System.out.println(m);
			}
		}
	}
}
