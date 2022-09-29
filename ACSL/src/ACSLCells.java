import java.util.*;
public class ACSLCells {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			
			String[] input = in.nextLine().split(", ");
			
			if(input.length == 2) {
				
				String action = input[0];
				String cell = input[1];
				
				String result = "";
				
				if(action.equals("DIVIDE")) {
					
					String w = cell.substring(0, 4);
					
					w += w;
					
					String q = cell.substring(4, 8);
					
					q += q;
					
					System.out.print(w +" and " + q);
					System.out.println();
				}
				else if(action.substring(0, 3).equals("ADD")) {
					int n = Integer.parseInt(action.substring(3, 4));
					
					String res = action.substring(0, n);
					
					for(int r = 0; r<8-n; r++) {
						res += input[1].substring(r, r+1);
					}
					
					System.out.print(res);
					System.out.println();
				}
				else {
					int n = Integer.parseInt(action.substring(8, 9));
					
					String res = input[1].substring(input[1].length()-n, input[1].length());
					
					String resu = "";
					
					for(int r = n; r<input[1].length(); r++) {
						resu += input[1].substring(r, r+1);
					}
					
					resu += res;
					
					System.out.print(resu);
					System.out.println();
				}
			}
			else {
				
				if(input[0].equals("UNION")) {
					String first = input[1].substring(4, 8);
					String second = input[2].substring(0, 4);
					
					System.out.print(first + second);
					System.out.println();
				}
				else {
					String first = input[1].substring(0, 2) + input[1].substring(input[1].length()-2, input[1].length());
					String second = input[2].substring(0, 2) + input[2].substring(input[2].length()-2, input[2].length());
					
					System.out.print(first + second);
					System.out.println();
				}	
			}
		}
	}
}
