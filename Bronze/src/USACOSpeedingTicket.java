import java.util.*;
import java.io.*;
public class USACOSpeedingTicket {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("speeding.in"));
		PrintWriter out = new PrintWriter("speeding.out");
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		ArrayList<Integer> speeds = new ArrayList<>();
		ArrayList<Integer> bessi = new ArrayList<>();
		
		for(int i= 0; i<n; i++) {
			int distance = in.nextInt();
			int speed = in.nextInt();
			
			for(int j = 0; j < distance; j++) {
				speeds.add(speed);
			}
		}
		
		int t = 0;
		
		for(int i = 0; i<m; i++) {
			int distance = in.nextInt();
			int bessieSpeed = in.nextInt();
			for(int j = 0; j<distance; j++) {
				bessi.add(bessieSpeed);
			}
		}
		
		for(int i = 0; i<100; i++) {
			if(bessi.get(i) > speeds.get(i)) {
				t = Math.max(bessi.get(i)-speeds.get(i), t);
			}
		}
		
		out.println(t);
		
		in.close();
		out.close();
	}
}
