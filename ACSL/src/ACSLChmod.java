import java.util.*;
public class ACSLChmod {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<2; i++) {
			String[] input = in.nextLine().split(", ");
			
			String aaa = Integer.toBinaryString(Integer.parseInt(input[0]));
			String a = String.format("%3s", aaa).replaceAll(" ", "0");
			String bbb = Integer.toBinaryString(Integer.parseInt(input[1]));
			String b = String.format("%3s", bbb).replaceAll(" ", "0");
			String ccc = Integer.toBinaryString(Integer.parseInt(input[2]));
			String c = String.format("%3s", ccc).replaceAll(" ", "0");
			
			String aa = "";
			String bb = "";
			String cc = "";
			
			for(int r = 0; r<3; r++) {
				if(a.substring(r,r+1).equals("1")) {
					if(r==0) {
						aa += "r";
					}
					else if(r == 1) {
						aa += "w";
					}
					else if(r == 2) {
						aa += "x";
					}
				}
				else {
					aa += "-";
				}
			}
			for(int r = 0; r<3; r++) {
				if(b.substring(r,r+1).equals("1")) {
					if(r==0) {
						bb += "r";
					}
					else if(r == 1) {
						bb += "w";
					}
					else if(r == 2) {
						bb += "x";
					}
				}
				else {
					bb += "-";
				}
			}
			for(int r = 0; r<3; r++) {
				if(c.substring(r,r+1).equals("1")) {
					if(r==0) {
						cc += "r";
					}
					else if(r == 1) {
						cc += "w";
					}
					else if(r == 2) {
						cc += "x";
					}
				}
				else {
					cc += "-";
				}
			}
			
			System.out.println("" + aaa + " " + bbb + " " + ccc + " and " + aa + " " + bb + " " + cc);
		}
		
		for(int i = 0; i<2; i++) {
			String[] input = in.nextLine().split(", ");
			
			String a = input[0];
			int aa = Integer.parseInt(a, 10);
			String b = input[1];
			int bb = Integer.parseInt(b, 10);
			String c = input[2];
			int cc = Integer.parseInt(c, 10);
			
			String aaa = "";
			String bbb = "";
			String ccc = "";
			
			for(int r = 0; r<3; r++) {
				if(a.substring(r,r+1).equals("1")) {
					if(r==0) {
						aaa += "r";
					}
					else if(r == 1) {
						aaa += "w";
					}
					else if(r == 2) {
						aaa += "x";
					}
				}
				else {
					aaa += "-";
				}
			}
			for(int r = 0; r<3; r++) {
				if(b.substring(r,r+1).equals("1")) {
					if(r==0) {
						bbb += "r";
					}
					else if(r == 1) {
						bbb += "w";
					}
					else if(r == 2) {
						bbb += "x";
					}
				}
				else {
					bbb += "-";
				}
			}
			for(int r = 0; r<3; r++) {
				if(c.substring(r,r+1).equals("1")) {
					if(r==0) {
						ccc += "r";
					}
					else if(r == 1) {
						ccc += "w";
					}
					else if(r == 2) {
						ccc += "x";
					}
				}
				else {
					ccc += "-";
				}
			}
			
			System.out.println("" + a + b + c + " and " + aaa + " " + bbb + " " + ccc);
		}
	}
}
