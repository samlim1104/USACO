import java.util.*;
public class ACSLPrintFormatting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			String[] input = in.nextLine().split(", ");
			
			String format = input[0];
			String value = input[1];
			
			if(format.indexOf(",") == -1 && format.indexOf("$") == -1 && format.indexOf(".") == -1) {
				
				if(value.length() == format.length()) {
					System.out.println(value);
				}
				else if(value.length() < format.length()) {
					int n = format.length() - value.length();
					
					String result = "";
					
					for(int r = 0; r<n; r++) {
						result += "*";
					}
					
					result += value;
					
					System.out.println(result);
				}
				else {
					aaasd;
				}
				
				
				
				
				
				
			}
		}
	}
}
