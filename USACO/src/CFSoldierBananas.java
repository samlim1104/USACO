import java.util.*;
public class CFSoldierBananas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] n = in.nextLine().split(" ");
				
		int cost = Integer.parseInt(n[0]);
		int money = Integer.parseInt(n[1]);
		int num = Integer.parseInt(n[2]);
		 
		int total = (num * (num + 1)) / 2;
		
		total *= cost;
		
		if(total > money) {
			System.out.println(total-money);
		}
		else {
			System.out.println(0);
		}
	}
}
