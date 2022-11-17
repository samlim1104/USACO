import java.util.*;
public class ACSLEnclosure {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			String input = in.next();
			
			String result = "";
		
			if(input.indexOf("[") >= 0 && input.indexOf("]") >=0) {
				if(input.indexOf("(") > 0) {
					for(int r = input.indexOf("(")+2; r<input.indexOf("]"); r++) {
						if(r < input.indexOf("]")-1 && isNumeric(input.substring(r, r+1)) && isNumeric(input.substring(r+1, r+2))) {
							result += r+3 + ", ";
						}
						else if(isNumeric(input.substring(r, r+1))) {
							result += r+2 + ", ";
						}
					}
					System.out.println(result.substring(0, result.length()-2));
				}
				else if(input.indexOf(")") > 0) {
					for(int r = input.indexOf("["); r<input.indexOf(")")-1; r++) {
						if(r <= input.indexOf(")")-2 && isNumeric(input.substring(r, r+1)) && isNumeric(input.substring(r+1, r+2))) {
							result += r+1 + ", ";
						}
						else if(isNumeric(input.substring(r, r+1))) {
							result += r+1 + ", ";
						}
					}
					System.out.println(result.substring(0, result.length()-2));
				}
			}
			else if(input.indexOf("(") >= 0 && input.indexOf(")") >= 0) {
				if(input.indexOf("[") >= 0) {
					result += input.indexOf(")") + 2 + ", ";
					for(int r = input.indexOf(")")+1; r<input.length(); r++) {
						if(r <= input.length()-2 && isNumeric(input.substring(r, r+1)) && isNumeric(input.substring(r+1, r+2))) {
							result += r+3 + ", ";
						}
						else if(isNumeric(input.substring(r, r+1))) {
							result += r+2 + ", ";
						}
					}
					System.out.println(result.substring(0, result.length()-2));
				}
				else if(input.indexOf("]") >= 0) {
					result += input.indexOf("(") + ", ";
					for(int r = 0; r < input.indexOf("("); r++) {
						if(r <= input.indexOf("(")-2 && isNumeric(input.substring(r, r+1)) && isNumeric(input.substring(r+1, r+2))) {
							result += r;
						}
						else if(isNumeric(input.substring(r, r+1))) {
							result += r;
						}
					}
					
					System.out.println(result.substring(0, result.length()-2));
				}
			}
		}
	}
	
	public static boolean isNumeric(String str) {
		if(str == null) {
			return false;
		}
		else {
			try {
				int num = Integer.parseInt(str);
			}catch(NumberFormatException e) {
				return false;
			}
			return true;
		}
	}
}
