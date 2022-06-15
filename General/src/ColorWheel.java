import java.util.*;
public class ColorWheel {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			String color = in.nextLine();
			
			String color1 = "";
			String color2 = "";
			
			if(color.equals("red")) {
				System.out.println("No colors need to be mixed to make red.");
			}
			else if(color.equals("yellow")) {
				System.out.println("No colors need to be mixed to make yellow.");
			}
			else if(color.equals("blue")) {
				System.out.println("No colors need to be mixed to make blue.");
			}
			else if(color.equals("orange") || color.equals("red-orange") || color.equals("yellow-orange")) {
				color1 = "red";
				color2 = "yellow";
			}
			else if(color.equals("violet") || color.equals("blue-violet") || color.equals("red-violet")) {
				color1 = "blue";
				color2 = "red";
			}
			else if(color.equals("green") || color.equals("yellow-green") || color.equals("blue-green")) {
				color1 = "blue";
				color2 = "yellow";
			}
			
			System.out.println("In order to make " + color + ", " + color1 + " and " + color2 + " must be mixed.");
		}
	}
}
