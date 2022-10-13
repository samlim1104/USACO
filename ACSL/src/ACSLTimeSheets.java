import java.util.*;
public class ACSLTimeSheets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			
			
			String[] input = in.nextLine().split(", ");
			
			double tot = 0;
			
				int location = Integer.parseInt(input[0]);
				int daynum = Integer.parseInt(input[1]);
				String s = input[2];
				String e = input[3];
				int startT = 0;
				int endT = 0;
				
				if(s.equals("A")) {
					startT = 10;
				}
				else if(s.equals("B")) {
					startT = 11;
				}
				else if(s.equals("C")) {
					startT = 12;
				}
				else if(s.equals("D")) {
					startT = 13;
				}
				else if(s.equals("E")) {
					startT = 14;
				}
				else if(s.equals("F")) {
					startT = 15;
				}
				else if(s.equals("G")) {
					startT = 16;
				}
				else if(s.equals("H")) {
					startT = 17;
				}
				else {
					startT = Integer.parseInt(s);
				}
				if(e.equals("A")) {
					endT = 10;
				}
				else if(e.equals("B")) {
					endT = 11;
				}
				else if(e.equals("C")) {
					endT = 12;
				}
				else if(e.equals("D")) {
					endT = 13;
				}
				else if(e.equals("E")) {
					endT = 14;
				}
				else if(e.equals("F")) {
					endT = 15;
				}
				else if(e.equals("G")) {
					endT = 16;
				}
				else if(e.equals("H")) {
					endT = 17;
				}
				else {
					endT = Integer.parseInt(e);
				}
				
				double hours = (endT - startT)/2.0;
				
				if(location >= 100 && location <= 199) {
					if(hours > 5) {
						double per = 10 * hours + 5 * (hours-5);
						tot += per;
					}
					else {
						double per = 10 * hours;
						tot+=per;
					}
				}
				else if(location >= 200 && location <= 299) {
					if(hours > 6) {
						double per = 45 + 15 * (hours - 6);
						tot += per;
					}
					else {
						double per = 7.5 * hours;
						tot += per;
					}
				}
				else if(location >= 300 && location <= 399) {
					if(hours > 4) {
						double per = 37 + 10.5 * (hours-4);
						tot += per;
					}
					else {
						double per = 9.25 * hours;
						tot += per;
					}
				}
				else if(location >= 400 && location <= 499) {
					if(daynum == 1 || daynum == 7) {
						double per = 13.5 * hours;
						tot += per;
					}
					else {
						double per = 6.75 * hours;
						tot += per;
					}
				}
				else if(location >= 500 && location <= 599) {
					if(hours > 6) {
						double per = 48 + 12 * (hours-6);
						tot += per;
					}
					else {
						double per = 8 * hours;
						tot += per;
					}
				}
				
				location = Integer.parseInt(input[4]);
				daynum = Integer.parseInt(input[5]);
				s = input[6];
				 e = input[7];
				 startT = 0;
				 endT = 0;
				
				if(s.equals("A")) {
					startT = 10;
				}
				else if(s.equals("B")) {
					startT = 11;
				}
				else if(s.equals("C")) {
					startT = 12;
				}
				else if(s.equals("D")) {
					startT = 13;
				}
				else if(s.equals("E")) {
					startT = 14;
				}
				else if(s.equals("F")) {
					startT = 15;
				}
				else if(s.equals("G")) {
					startT = 16;
				}
				else if(s.equals("H")) {
					startT = 17;
				}
				else {
					startT = Integer.parseInt(s);
				}
				if(e.equals("A")) {
					endT = 10;
				}
				else if(e.equals("B")) {
					endT = 11;
				}
				else if(e.equals("C")) {
					endT = 12;
				}
				else if(e.equals("D")) {
					endT = 13;
				}
				else if(e.equals("E")) {
					endT = 14;
				}
				else if(e.equals("F")) {
					endT = 15;
				}
				else if(e.equals("G")) {
					endT = 16;
				}
				else if(e.equals("H")) {
					endT = 17;
				}
				else {
					endT = Integer.parseInt(e);
				}
				
				hours = (endT - startT)/2.0;
				
				if(location >= 100 && location <= 199) {
					if(hours > 5) {
						double per = 10 * hours + 5 * (hours-5);
						tot += per;
					}
					else {
						double per = 10 * hours;
						tot+=per;
					}
				}
				else if(location >= 200 && location <= 299) {
					if(hours > 6) {
						double per = 45 + 15 * (hours - 6);
						tot += per;
					}
					else {
						double per = 7.5 * hours;
						tot += per;
					}
				}
				else if(location >= 300 && location <= 399) {
					if(hours > 4) {
						double per = 37 + 10.5 * (hours-4);
						tot += per;
					}
					else {
						double per = 9.25 * hours;
						tot += per;
					}
				}
				else if(location >= 400 && location <= 499) {
					if(daynum == 1 || daynum == 7) {
						double per = 13.5 * hours;
						tot += per;
					}
					else {
						double per = 6.75 * hours;
						tot += per;
					}
				}
				else if(location >= 500 && location <= 599) {
					if(hours > 6) {
						double per = 48 + 12 * (hours-6);
						tot += per;
					}
					else {
						double per = 8 * hours;
						tot += per;
					}
				}
				
				tot = Math.round(tot * 100.0) / 100.0;
				
				System.out.println("$" + tot);
		}
	}
}
