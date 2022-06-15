
import java.util.*;
public class AnimalFarm {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			int testCases = Integer.parseInt(in.nextLine());
			
			for(int i = 0; i<testCases; i++) {
				String[] input = in.nextLine().split(" ");
				
				int turkeys = Integer.parseInt(input[0]);
				int goats = Integer.parseInt(input[1]);
				int horses = Integer.parseInt(input[2]);
				
				int turkeyLegs = turkeys * 2;
				int goatLegs = goats * 4;
				int horseLegs = horses * 4;
				
				System.out.println(turkeyLegs + goatLegs + horseLegs);
			}
		}
	}
}
