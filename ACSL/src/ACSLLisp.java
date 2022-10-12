import java.util.*;
public class ACSLLisp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			String[] input = in.nextLine().split(" ");
			
			if(i == 0) {
				String result = "'(";
				for(int r = input.length-1; r>=0; r--) {
					if(r == input.length-1){
						result += input[r].substring(0,1) + " ";
					}
					else if(r == 0) {
						result += input[r].substring(2,3) + ")";
					}
					else {
						result += input[r] + " ";
					}
				}
				
				System.out.println(result);
			}
			else if(i == 1) {
				String place = input[0].substring(2,3);
				
				String result = "'(";
				
				int num = 1;
				
				for(int r = 1; r<input.length; r++) {
					if(input[r].equals(place)) {
						num++;
					}
					else if(r == input.length-1) {
						num++;
						result += "(" + num + " " + place + ")" + ")";
					}
					else {
						result += "(" + num + " " + place + ")" + " ";
						
						place = input[r];
						num = 1;
					}
				}
				
				System.out.println(result);
			}
			else if(i == 2) {
				String place = input[0].substring(2,3);
				
				String result = "'(";
				
				int num = 1;
				
				for(int r = 1; r<input.length; r++) {
					if(input[r].equals(place)) {
						num++;
					}
					else if(r == input.length-1 && num != 1) {
						num++;
						result += "(" + num + " " + place + ")" + ")";
					}
					else if(r == input.length-1 && num == 1) {
						result += "(" + num + " " + place + ")" + ")";
					}
					else {
						if(num == 1) {
							if(r == 1) {
								result += input[r-1].substring(2, 3) + " ";
								place = input[r];
								num = 1;
							}
							else {
								result += input[r-1] + " ";
								place = input[r];
								num = 1;
							}
						}
						else {
							result += "(" + num + " " + place + ")" + " ";
							
							place = input[r];
							num = 1;
						}
					}
				}
				System.out.println(result);
			}
			else if(i==3) {
				String result = "'(" + input[0].substring(2, 4) + " " + input[1] + " ";
				
				int index = Integer.parseInt(input[input.length-1].substring(0,1));
				
				for(int r = 2; r<input.length-1; r+=2) {
					if((r /2 + 1) % index == 0) {
						continue;
					}
					else {
						result += input[r] + " " + input[r+1] + " ";
					}
				}
				
				result += index + ")";
			
				System.out.println(result);
			}
			else if(i == 4) {
				String result = input[0] + " " + input[1];
				
				int index = Integer.parseInt(input[input.length-1].substring(0,1));
				
				for(int r = 2; r<input.length-1; r+=2) {
					if(r == index*2) {
						result += ") '(" + input[r] + " " + input[r+1];
					}
					else {
						result += " " + input[r] + " " + input[r+1];
					}
				}
				
				result += " " + index + ")";
				
				System.out.println(result);
			}
		}
	}
}
