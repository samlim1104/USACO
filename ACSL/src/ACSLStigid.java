import java.util.*;
public class ACSLStigid {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			String[] input = in.nextLine().split(" ");
			
			Long sum = 0L;
			
			for(int r = 0; r<=input[0].length()-Integer.parseInt(input[1]); r++) {
					String a = input[0].substring(r, r+Integer.parseInt(input[1]));
					sum += Long.parseLong(a);
			}
			
			System.out.println(sum);
		}
	}
}
