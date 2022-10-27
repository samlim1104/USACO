import java.util.*;
public class ACSLAgram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			String[] www = in.nextLine().split(", ");
			
			String fN = www[0].substring(0,1);
			
			int firstNum = 0;
			if(fN.equals("A")) {
				firstNum = 1;
			}
			else if(fN.equals("K")) {
				firstNum = 13;
			}
			else if(fN.equals("Q")) {
				firstNum = 12;
			}
			else if(fN.equals("J")) {
				firstNum = 11;
			}
			else if(fN.equals("T")) {
				firstNum = 10;
			}
			else {
				firstNum = Integer.parseInt(fN);
			}

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
				int max = 100;
				int imax = 0;
				int min = 100;
				int imin = 0;
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
					
					if(val > firstNum && val < max) {
						max = val;
						imax = r;
					}
					else if(val < firstNum) {
						min = val;
						imin = r;
					}
				}
				
				if(max != 0) {
					System.out.println(poss.get(imax));
				}
				else {
					System.out.println(poss.get(imin));
				}
			}
			else {
				int min = 100;
				int ind = 0;
				for(int r = 0; r<dealer.length; r++) {
					int val = 0;
					if(dealer[r].substring(0,1).equals("A")) {
						val = 1;
					}
					else if(dealer[r].substring(0,1).equals("K")) {
						val = 13;
					}
					else if(dealer[r].substring(0,1).equals("Q")) {
						val = 12;
					}
					else if(dealer[r].substring(0,1).equals("J")) {
						val = 11;
					}
					else if(dealer[r].substring(0,1).equals("T")) {
						val = 10;
					}
					else {
						val = Integer.parseInt(dealer[r].substring(0,1));
					}
					
					if(val < min) {
						min = val;
						ind = r;
					}
				}
				System.out.println(dealer[ind]);
			}
		}		
	}
}
