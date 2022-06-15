import java.util.*;
public class Donor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			String[] l = in.nextLine().split(",");
			String[] t = in.nextLine().split(",");
			
			ArrayList<String> lastYear = new ArrayList<>();
			ArrayList<String> thisYear = new ArrayList<>();
			
			for(int a = 0; a<l.length; a++) {
				lastYear.add(l[a]);
			}
			for(int y = 0; y<t.length; y++) {
				thisYear.add(t[y]);
			}

			ArrayList<String> both = new ArrayList<>();
			
			int shortest = 0;
			int longest = 0;
			
			if(lastYear.size() == thisYear.size()) {
				shortest = lastYear.size();
				longest = thisYear.size();
				
				for(int r = 0; r<shortest; r++) {
					for(int c =0; c<longest; c++) {
						if(lastYear.get(r).equals(thisYear.get(c))) {
							both.add(lastYear.remove(r));
							thisYear.remove(c);
						}
						c--;
					}
					r--;
				}
				
				for(int p = 0; p<lastYear.size(); p++) {
					if(p == lastYear.size()-1) {
						System.out.print(lastYear.get(p));
					}
					else{System.out.print(lastYear.get(p) + ",");
					}
					}
				System.out.println();
				for(int q = 0; q<both.size(); q++) {
					if(q == both.size()-1) {
						System.out.print(both.get(q));
					}
					else{System.out.print(both.get(q) + ",");}
				}
				System.out.println();
				for(int a = 0; a<thisYear.size(); a++) {
					if(a == lastYear.size()-1) {
						System.out.print(thisYear.get(a));
					}
					else{System.out.print(thisYear.get(a) + ",");}
				}
				System.out.println();
				
				
			}
			else if(lastYear.size() > thisYear.size()) {
				shortest = thisYear.size();
				longest = lastYear.size();
				
				for(int r = 0; r<shortest; r++) {
					for(int c =0; c<longest; c++) {
						if(thisYear.get(r).equals(lastYear.get(c))) {
							both.add(thisYear.remove(r));
							lastYear.remove(c);
						}
						c--;
					}
					r--;
				}
				
				for(int r = 0; r<lastYear.size(); r++) {
					if(r == lastYear.size()-1) {
						System.out.print(lastYear.get(r));
					}
					else{System.out.print(lastYear.get(r) + ",");
					}
					}
				System.out.println();
				for(int q = 0; q<both.size(); q++) {
					if(q == both.size()-1) {
						System.out.print(both.get(q));
					}
					else{System.out.print(both.get(q) + ",");}
				}
				System.out.println();
				for(int a = 0; a<thisYear.size(); a++) {
					if(a == lastYear.size()-1) {
						System.out.print(thisYear.get(a));
					}
					else{System.out.print(thisYear.get(a) + ",");}
				}
				System.out.println();
				
				
			}
			else if(lastYear.size() < thisYear.size()) {
				shortest = lastYear.size();
				longest = thisYear.size();
				
				for(int r = 0; r<shortest; r++) {
					for(int c =0; c<longest; c++) {
						if(lastYear.get(r).equals(thisYear.get(c))) {
							both.add(lastYear.remove(r));
							thisYear.remove(c);
						}
					}
					r--;
				}
				
				for(int r = 0; r<lastYear.size(); r++) {
					if(r == lastYear.size()-1) {
						System.out.print(lastYear.get(r));
					}
					else{System.out.print(lastYear.get(r) + ",");
					}
					}
				System.out.println();
				for(int q = 0; q<both.size(); q++) {
					if(q == both.size()-1) {
						System.out.print(both.get(q));
					}
					else{System.out.print(both.get(q) + ",");}
				}
				System.out.println();
				for(int a = 0; a<thisYear.size(); a++) {
					if(a == lastYear.size()-1) {
						System.out.print(thisYear.get(a));
					}
					else{System.out.print(thisYear.get(a) + ",");}
				}
				System.out.println();
			}
			
			
		}
	}
}
