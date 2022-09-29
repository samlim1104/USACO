import java.util.*;
public class ACSLBits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			String[] input = in.nextLine().split(", ");
			
			String bit = input[0];
			
			int nums = Integer.parseInt(input[1]);
			
			ArrayList<String> result = new ArrayList<>();
			
			n1: for(int a = 2; a<nums+2; a++) {
				
				boolean possible = true;
				
				n2: for(int b = 0; b<bit.length(); b++) {
					if(bit.substring(b, b+1).equals("0") && input[a].substring(b,b+1).equals("1")){
						possible = false;
					}
					else if(bit.substring(b, b+1).equals("1") && input[a].substring(b,b+1).equals("0")) {
						possible = false;
					}
				}
				
				if(possible) {
					result.add(input[a]);
				}
			}
			
			if(result.size() > 0) {
				for(int r = 0; r<result.size(); r++) {
					if(r < result.size()-1) {
						System.out.print(result.get(r) + ", ");
					}
					else {
						System.out.print(result.get(r));
					}
				}
			}
			else {
				System.out.print("NONE");
			}
			
			System.out.println();
		}
	}
}
