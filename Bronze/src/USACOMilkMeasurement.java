import java.util.*;
import java.io.*;
public class USACOMilkMeasurement {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("measurement.in"));
		PrintWriter out = new PrintWriter("measurement.out");  
		
		int N = Integer.parseInt(in.nextLine());
		
		String[] days = new String[100];
		
		int B = 7, E = 7, M = 7;
		
		int t = 0;
		
		String[] names = new String[] {"Bessie", "Elsie", "Mildred"};
		String[] n = new String[3];
		
		for(int i = 0; i<N; i++) {
			int day = in.nextInt();
			day--;
			String name = in.next();
			String val = in.next();
			
			name += val;
			
			days[day] = name;
		}
		
		int max = 7;
		
		for(int a = 0; a<days.length; a++) {
			max = Math.max(B, Math.max(E, M));
				if(days[a] != null) {
					if(days[a].indexOf("Bessie") == 0) {
						if(days[a].indexOf("+") > 0) {
							B += Integer.parseInt(days[a].substring(days[a].indexOf("+") + 1, days[a].length()));
						}
						else {
							B -= Integer.parseInt(days[a].substring(days[a].indexOf("-") + 1, days[a].length()));
					}
					}
					if(days[a].indexOf("Elsie") == 0) {
						if(days[a].indexOf("+") > 0) {
							E += Integer.parseInt(days[a].substring(days[a].indexOf("+") + 1, days[a].length()));
						}
						else {
							E -= Integer.parseInt(days[a].substring(days[a].indexOf("-") + 1, days[a].length()));
						}
					}
					if(days[a].indexOf("Mildred") == 0) {
						if(days[a].indexOf("+") > 0) {
							M += Integer.parseInt(days[a].substring(days[a].indexOf("+") + 1, days[a].length()));
							
						}
						else {
							M -= Integer.parseInt(days[a].substring(days[a].indexOf("-") + 1, days[a].length()));
							
						}
					}
					
					max = Math.max(B, Math.max(E, M));
					
					n[0] = "A";
					n[1] = "A";
					n[2] = "A";
					
					if(B == max) {
						n[0] = "Bessie";
					}
					if(E == max) {
						n[1] = "Elsie";
					}
					if(M == max) {
						n[2] = "Mildred";
					}
					
					for(int b = 0; b<3; b++) {
						if(!n[b].equals(names[b])) {
							t++;
							names = n.clone();
						}
					}
				}
				}
		out.println(t);
		
		in.close();
		out.close();
		
		}
	}