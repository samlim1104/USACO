import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class USACOPromotionCounting {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("promote.in"));
		PrintWriter out = new PrintWriter("promote.out");
		
		String[] bronze = in.readLine().split(" ");
		String[] silver = in.readLine().split(" ");
		String[] gold = in.readLine().split(" ");
		String[] plat = in.readLine().split(" ");
		
		int numProPlat = Math.abs(Integer.parseInt(plat[1]) - Integer.parseInt(plat[0]));
		int numProGold = Math.abs((Integer.parseInt(plat[1]) + Integer.parseInt(gold[1])) - (Integer.parseInt(plat[0]) + Integer.parseInt(gold[0])));
		int numProSilver = Math.abs((Integer.parseInt(gold[1]) + Integer.parseInt(silver[1]) + Integer.parseInt(plat[1])) - (Integer.parseInt(gold[0]) + Integer.parseInt(silver[0]) + Integer.parseInt(plat[0])));
		
		out.println(numProSilver);
		out.println(numProGold);
		out.println(numProPlat);
		
		in.close();
		out.close();
}
}