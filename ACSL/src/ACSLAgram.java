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
			
			boolean sameSuit = false;
			
			ArrayList<String> sameSuits = new ArrayList<>();
			
			for(int r = 0; r<5; r++) {
				if(dealer[r].substring(1,2).equals(suit)) {
					sameSuits.add(dealer[r]);
					sameSuit = true;
				}
			}
			
			int first = 0;
			if(firstNum.equals("T")) {
				first = 10;
			}
			else if(firstNum.equals("J")) {
				first = 11;
			}
			else if(firstNum.equals("Q")) {
				first = 12;
			}
			else if(firstNum.equals("K")) {
				first = 13;
			}
			else if(firstNum.equals("A")) {
				first = 1;
			}
			else {
				first = Integer.parseInt(firstNum);
			}
			
			int min = first;
			int indSameSuit = -1;
			int max = 16;
			
			for(int r = 0; r<5; r++) {
				if(dealer[r].substring(0,1).equals("T") && dealer[r].substring(1,2).equals(suit)) {
					if(10 >= first && 10 <= max) {
						indSameSuit = r;
						max = 10;

					}
				}
				else if(dealer[r].substring(0,1).equals("J") && dealer[r].substring(1,2).equals(suit)) {
					if(11 >= first && 11 <= max) {
						indSameSuit = r;
						max = 11;

					}
				}
				else if(dealer[r].substring(0,1).equals("Q") && dealer[r].substring(1,2).equals(suit)) {
					if(12 >= first && 12 <= max) {
						indSameSuit = r;
						max = 12;

					}
				}
				else if(dealer[r].substring(0,1).equals("K") && dealer[r].substring(1,2).equals(suit)) {
					if(13 >= first && 12 <= max) {
						indSameSuit = r;
						max = 13;

					}
				}
				else if(dealer[r].substring(0,1).equals("A") && dealer[r].substring(1,2).equals(suit)) {
					if(1 >= first && 1 <= max) {
						indSameSuit = r;
						max = 1;

					}
				}
				else if(dealer[r].substring(1,2).equals(suit)){
					if(Integer.parseInt(dealer[r].substring(0,1)) >= first && Integer.parseInt(dealer[r].substring(0,1)) <=max) {
						indSameSuit = r;
						max = Integer.parseInt(dealer[r].substring(0,1));

					}
				}
			}
			
			int ind = 0;
			
			if(min == first && !sameSuit) {
				for(int r = 0; r<5; r++) {
					if(dealer[r].substring(0,1).equals("T")) {
						if(10 < min) {
							ind = r;
							min = 10;
						}
					}
					else if(dealer[r].substring(0,1).equals("J")) {
						if(11<min) {
							ind = r;
							min = 11;
						}
					}
					else if(dealer[r].substring(0,1).equals("Q")) {
						if(12<min) {
							ind = r;
							min = 12;
						}
					}
					else if(dealer[r].substring(0,1).equals("K")) {
						if(13<min) {
							ind = r;
							min = 13;
						}
					}
					else if(dealer[r].substring(0,1).equals("A")) {
						if(1<min) {
							ind = r;
							min = 1;
						}
					}
					else {
						if(Integer.parseInt(dealer[r].substring(0,1)) < min) {
							ind = r;
							min = Integer.parseInt(dealer[r].substring(0,1));
						}
					}
				}
				System.out.println(dealer[ind]);
			}
			else if(sameSuit && min == first){
				for(int r = 0; r<sameSuits.size(); r++) {
					if()
				}
			}
		}
	}
}
