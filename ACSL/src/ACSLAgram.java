import java.util.*;
public class ACSLAgram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			String[] www = in.nextLine().split(", ");
			
			String firstNum = www[0].substring(0,1);
			String suit = www[0].substring(1,2);
			
			String[] dealer = new String[5];
			
			for(int r = 1; r<6; r++) {
				dealer[r-1] = www[r];
			}
			
			ArrayList<String> poss = new ArrayList<>();
			
			for(int r = 0; r<5; r++) {
				if(dealer[r].substring(1, 2).equals(suit)) {
					poss.add(dealer[r]);
				}
			}
			
			if(poss.size() > 0) {
				int max = 0;
				int min = 0;
				for(int r = 0; r<poss.size(); r++) {
					int val = 0;
					if(poss.get(r).substring(0,1).equals("A")) {
						val = 1;
					}
					else if(poss.get(r).substring(0,1).equals("K")) {
						val = 13;
					}
					else if(poss.get(r).substring(0,1).equals("Q")) {
						val = 12;
					}
					else if(poss.get(r).substring(0,1).equals("J")) {
						val = 11;
					}
					else if(poss.get(r).substring(0,1).equals("T")) {
						val = 10;
					}
					else {
						val = Integer.parseInt(poss.get(r).substring(0,1));
					}
					
					if(val > Integer.parseInt(firstNum)) {
						System.out.println(poss.get(r));
						return;
					}
					else {
						min = val;
					}
				}
				System.out.println(min);
			}
		}		
	}
}
