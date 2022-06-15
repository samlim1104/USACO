import java.util.*;
public class Gorillas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			String[] d = in.nextLine().split(" ");
			
			String g1 = d[0];
			String g2 = d[1];
			
			if(g1.equals(g2)){
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
	}
}
