import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
public class BatterUp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			
			String[] array = in.nextLine().split(":");
			
			String name = array[0];
			
			String[] atBats = array[1].split(",");
			
			int totalAtBats = 0;
			int totalSLG = 0;
				
			for(int s = 0; s<atBats.length; s++) {
				if(atBats[s].equals("K")) {
						totalAtBats++;
				}
				else if(atBats[s].equals("1B")) {
					totalAtBats++;
					totalSLG++;
				}
				else if(atBats[s].equals("2B")) {
					totalAtBats++;
					totalSLG+=2;
				}
				else if(atBats[s].equals("3B")) {
					totalAtBats++;
					totalSLG+=3;
				}
				else if(atBats[s].equals("HR")) {
					totalAtBats++;
					totalSLG+=4;
				}
			}
			
			if(totalAtBats == 0) {
				int t = 0;
				System.out.println(name + "=" + t);
			}
			else {
				double s = (double) totalSLG/totalAtBats;
				String g = String.valueOf(s);
				String j = BatterUp.roundDecimalUsingBigDecimal(g, 3);
				System.out.println(name + "=" + j);
			}
			
			
		}
	}
	
	public static String roundDecimalUsingBigDecimal(String strValue, int decimalPlace) {
	    return new BigDecimal(strValue).setScale(decimalPlace, RoundingMode.HALF_UP).toPlainString();
	  }
}
