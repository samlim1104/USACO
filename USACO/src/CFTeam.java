import java.util.*;
public class CFTeam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int problems = Integer.parseInt(in.nextLine());
		
		int count = 0;
		
		for(int i = 0; i<problems; i++) {
			String[] n = in.nextLine().split(" ");
			
			int a = Integer.parseInt(n[0]);
			int b = Integer.parseInt(n[1]);
			int c = Integer.parseInt(n[2]);
			
			if(a + b + c >= 2) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
