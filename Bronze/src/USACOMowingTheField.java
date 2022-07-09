import java.util.*;
import java.io.*;
public class USACOMowingTheField {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("mowing.in"));
		PrintWriter out = new PrintWriter("mowing.out");  
		
		int N = Integer.parseInt(in.nextLine());
		
		int maxVert = 0;
		int maxHor = 0;
		
		int vertical = 0;
		int horizontal = 0;
		
		int distance = 0;
		int max = -1;
		
		for(int i = 0; i<N; i++) {
			String[] d = in.nextLine().split(" ");
			
			if(d[0].equals("N")) {
				
				if(vertical < 0 && horizontal < 0 && vertical + Integer.parseInt(d[1]) >= 0) {
					distance += Integer.parseInt(d[1]) - maxVert;
					max = Math.max(distance - horizontal, max);
					distance = 0;
				}
				else {
					vertical += Integer.parseInt(d[1]);
					distance += Integer.parseInt(d[1]);
					maxVert = Math.max(Math.abs(vertical), maxVert);
				}
			}
			if(d[0].equals("S")) {
				
				if(vertical > 0 && horizontal > 0 && vertical - Integer.parseInt(d[1]) <= 0) {
					distance += Integer.parseInt(d[1]) - maxVert;
					max = Math.max(distance - horizontal, max);
					distance = 0;
				}
				else {
					vertical -= Integer.parseInt(d[1]);
					distance += Integer.parseInt(d[1]);
					maxVert = Math.max(Math.abs(vertical), maxVert);
				}
			}
			if(d[0].equals("E")) {
				
				if(horizontal < 0 && vertical < 0 && horizontal + Integer.parseInt(d[1]) >= 0) {
					distance += Integer.parseInt(d[1]) - maxHor;
					max = Math.max(distance - vertical, max);
					distance = 0;
				}
				else {
					horizontal += Integer.parseInt(d[1]);
					distance += Integer.parseInt(d[1]);
					maxHor = Math.max(Math.abs(horizontal), maxHor);
				}
			}
			if(d[0].equals("W")) {
				
				if(horizontal > 0 && vertical > 0 && horizontal - Integer.parseInt(d[1]) <= 0) {
					distance += Integer.parseInt(d[1]) - maxHor;
					max = Math.max(distance - vertical, max);
					distance = 0;
				}
				else {
					horizontal -= Integer.parseInt(d[1]);
					distance += Integer.parseInt(d[1]);
					maxHor = Math.max(Math.abs(horizontal), maxHor);
				}
			}
		}
		
		out.println(max);
		
		in.close();
		out.close();
	}
}
