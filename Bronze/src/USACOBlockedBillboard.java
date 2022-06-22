import java.io.*;
import java.util.*;
public class USACOBlockedBillboard {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("billboard.in"));
		PrintWriter out = new PrintWriter("billboard.out");
		
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int x3 = in.nextInt();
		int y3 = in.nextInt();
		int x4 = in.nextInt();
		int y4 = in.nextInt();
		
		int area = ((Math.min(y2, y4) - Math.max(y1, y3)) * ((Math.min(x2,  x4) - Math.max(x1, x3))));
		
		int areaOfBillboard = (x2 - x1) * (y2-y1);
		
		int numCorners = 0;
		
		if(covered(x1, y1, x3, y3, x4, y4)) {
			numCorners++;
		}
		if(covered(x1, y2, x3, y3, x4, y4)) {
			numCorners++;
		}
		if(covered(x2, y1, x3, y3, x4, y4)) {
			numCorners++;
		}
		if(covered(x2, y2, x3, y3, x4, y4)) {
			numCorners++;
		}
		
		if(numCorners == 1) {
			out.println(areaOfBillboard);
		}
		else if(numCorners == 0) {
			out.println(areaOfBillboard);
		}
		else {
			out.println(areaOfBillboard-area);
		}

		in.close();
		out.close();
	}
	
	
	public static boolean covered(int x, int y, int x1, int y1, int x2, int y2) {
		return x >= x1 && x <= x2 && y <= y2 && y >= y1;
	}
}
