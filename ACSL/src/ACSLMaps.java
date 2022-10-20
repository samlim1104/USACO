import java.util.*;
public class ACSLMaps {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			int A = 0;
			int B = 450;
			int C = 590;
			int D = 710;
			int E = 1030;
			int F = 1280;
			int G = 1360;
			
			
			String[] input = in.nextLine().split(", ");
			
			int start = 0;
			int end = 0;
			
			if(input[0].equals("A")) {
				start = A;
			}
			if(input[0].equals("B")) {
				start = B;
			}
			if(input[0].equals("C")) {
				start = C;
			}
			if(input[0].equals("D")) {
				start = D;
			}
			if(input[0].equals("E")) {
				start = E;
			}
			if(input[0].equals("F")) {
				start = F;
			}
			if(input[0].equals("G")) {
				start = G;
			}
			
			if(input[1].equals("A")) {
				end = A;
			}
			if(input[1].equals("B")) {
				end = B;
			}
			if(input[1].equals("C")) {
				end = C;
			}
			if(input[1].equals("D")) {
				end = D;
			}
			if(input[1].equals("E")) {
				end = E;
			}
			if(input[1].equals("F")) {
				end = F;
			}
			if(input[1].equals("G")) {
				end = G;
			}
			
			int miles = end - start;
			
			double gallons = 0;
			if(input[2].equals("C")) {
				gallons = miles / 28.0;
			}
			if(input[2].equals("M")) {
				gallons = miles / 25.0;
			}
			if(input[2].equals("F")) {
				gallons = miles / 22.0;
			}
			if(input[2].equals("V")) {
				gallons = miles / 20.0;
			}
			
			
			double cost = 0;
			cost = gallons * Double.parseDouble(input[4]); 
			
			double time = 0;
			if(input[3].equals("I")) {
				time = miles/65.0;
			}
			if(input[3].equals("H")) {
				time = miles/60.0;
			}
			if(input[3].equals("M")) {
				time = miles/55.0;
			}
			if(input[3].equals("S")) {
				time = miles/45.0;
			}
			
			
			int hours = (int) time;
			double t = time - hours;
			int min = (int) (t * 60);
			
			System.out.println(miles + ", " + hours + ":" + min + ", " + "$" + cost);
		}
	}
}
