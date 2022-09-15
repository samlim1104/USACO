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
			
			sal /= s;
			
			season.add(s);
			salary.add(sal);
		}
		
		double tot5 = 0;
		double tot6 = 0;
		int num5 = 0;
		int num6 = 0;
		
		int maxSal = 0;
		
		double max = 0;
		int maxIndex = 0;
		
		for(int i = 0; i<n; i++) {
			if(season.get(i) == 5) {
				tot5+= salary.get(i);
				num5++;
			}
			else {
				tot6+=salary.get(i);
				num6++;
			}
			
			maxSal+=salary.get(i);
			
			if(salary.get(i) > max) {
				max = salary.get(i);
				maxIndex = i;
			}
		}
	
		maxSal /=10;
		maxSal = maxSal * 1000000;
		
		double av5 = (tot5/num5);
		double av6 = (tot6/num6);
		
		int averageDiff = (int) (Math.abs(av5-av6)) * 1000000;
		
		max = max * 1000000;
		
		Collections.sort(salary);
		
		System.out.println((maxSal));
		System.out.println(Math.round(max) + " by " + "#" + (maxIndex + 1));
		
		
		System.out.println(Math.round(averageDiff));
	}
}
