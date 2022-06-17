import java.math.BigInteger;
import java.util.*;
public class GrainsOfSand {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			int teams = Integer.parseInt(in.nextLine());
			
			BigInteger sum = new BigInteger(in.nextLine());
			
			for(int a = 0; a<teams-1; a++) {
				BigInteger r = new BigInteger(in.nextLine());
				sum = sum.add(r);
			}
			
			System.out.println(sum);
		}
	}
}
