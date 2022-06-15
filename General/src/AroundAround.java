
import java.util.*;
public class AroundAround {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			
			int altitude = Integer.parseInt(in.nextLine());
			 double diameter = 40075 / Math.PI;
			 
			 double totalDiameter = diameter + 2 * altitude;
			 
			 double totalDistance = totalDiameter * Math.PI;
			  
			 System.out.println(Math.round(totalDistance * 10.0) / 10.0);
		}
	}
}
