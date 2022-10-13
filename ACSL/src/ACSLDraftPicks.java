import java.util.*;
import java.io.*;
public class ACSLDraftPicks {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		int n = 10;
		
		ArrayList<Integer> season = new ArrayList<>();
		ArrayList<Double> salary = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			String[] a = in.nextLine().split(", ");
			
			int s = Integer.parseInt(a[0]);
			double sal = Double.parseDouble(a[1]);
			
			season.add(s);
			salary.add(sal);
		}
		
		double avg = 0;
		
		double[] avgSal = new double[10];
		
		for(int r = 0; r<10; r++) {
			avgSal[r] = salary.get(r) / season.get(r);
		}
		
		double largest = 0;
		int index = 0;
		
		for(int r = 0; r<10; r++) {
			if(avgSal[r] > largest) {
				largest = avgSal[r];
				index = r;
			}
		}
		
		for(int r =0; r<10; r++) {
			avg += avgSal[r];
		}
		
		avg = avg/10;
		
		double[] game16 = new double[10];
		
		for(int r = 0; r<10; r++) {
			game16[r] = avgSal[r] / 16;
		}
		
		double highest= 0;
		double lowest = 10000;
		
		for(int r= 0; r<10; r++) {
			if(game16[r] > highest) {
				highest = game16[r];
			}
			else if(game16[r] < lowest) {
				lowest = game16[r];
			}
		}
		
		double[] game18 = new double[10];
		
		for(int r = 0; r<10; r++) {
			game18[r] = avgSal[r] / 18;
		}
		
		double h= 0;
		double l = 10000;
		
		for(int r= 0; r<10; r++) {
			if(game18[r] > h) {
				h = game18[r];
			}
			else if(game18[r] < l) {
				l = game18[r];
			}
		}
		
		double avg16 = 0;
		double avg18 = 0;
		
		for(int r = 0; r<10; r++) {
			avg16 += game16[r];
			avg18 += game18[r];
		}
		
		avg16 = avg16/10;
		avg18 = avg18/10;
		
		System.out.println(avg * 1000000);
		System.out.println(largest * 1000000 + " by #" + index);
		System.out.println((highest - lowest) * 1000000);
		System.out.println((h + l)/2 * 1000000);
		System.out.println(Math.abs(avg18 - avg16) * 1000000);
	}
}
