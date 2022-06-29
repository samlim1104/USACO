import java.util.*;
import java.io.*;		
public class USACOLostCow {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("lostcow.in"));
		PrintWriter out = new PrintWriter("lostcow.out"); 
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		int totDistance = 0;
		int moved = 1;
		int count = 0;
		int current = x;
		
		if(y > x) {
			boolean factor = true;
			while(factor) {
				if(count % 2 == 0) {
				if(x + moved >= y) {
					totDistance += (y - current);
					factor = false;
				}
				else {
					totDistance += (x + moved - current);
					current = x + moved;
					moved *= 2;
					count++;
				}
				}
				else {
					totDistance += (current - (x - moved));
					current = x - moved;
					moved *= 2;
					count++;
				}
			}
		}
		else if(y < x) {
			boolean factor = true;
			totDistance += moved;
			current = x + moved;
			count++;
			moved*=2;
			while(factor) {
				if(count % 2 == 1) {
					if(x - moved <= y) {
						totDistance += (current - y);
						factor = false;
					}
					else {
						totDistance += (current - (x - moved));
						current = x - moved;
						moved *= 2;
						count++;
					}
				}
				else {
					totDistance += (x + moved - current);
					current = x + moved;
					moved *= 2;
					count++;
				}
			}
		}
		
		out.println(totDistance);
		
		
		in.close();
		out.close();
	}
}
