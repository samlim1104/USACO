
import java.util.*;
public class AntiAsteroid {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			int testCases = Integer.parseInt(in.nextLine());
			
			for(int i = 0; i<testCases; i++) {
				int numAsteroids = Integer.parseInt(in.nextLine());
				double[] distances = new double[numAsteroids];
				for(int a = 0; a<numAsteroids; a++) {
					String[] coordinates = in.nextLine().split(" ");
					
					for(int s = 0; s<coordinates.length-1; s++) {
						
						distances[s] = Math.sqrt(Math.pow(Integer.parseInt(coordinates[0]), 2) + Math.pow(Integer.parseInt(coordinates[1]), 2));
					}
					
				}
				
				for(int r = 0; r<distances.length; r++) {
					
				}
			}
		}
	}
}
