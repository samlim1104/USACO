import java.util.*;
import java.io.*;
public class USACOTicTacToe {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("tttt.in"));
		PrintWriter out = new PrintWriter("tttt.out");
		
		int count1 = 0; 
		int count2 = 0;
		
		Character[][] board = new Character[3][3];
		
		for(int r = 0; r<3; r++) {
			String m = in.next();
			board[r][0] = m.charAt(0);
			board[r][1] = m.charAt(1);
			board[r][2] = m.charAt(2);
		}
		
		for(int a = 0; a<3; a++) {
			String m = check(board[a][0], board[a][1], board[a][2]);
			
			count1 += Integer.parseInt(m.substring(0,1));
			count2 += Integer.parseInt(m.substring(1,2));
		}
		
		for(int a = 0; a<3; a++) {
			String m = check(board[0][a], board[1][a], board[2][a]);
			
			count1 += Integer.parseInt(m.substring(0,1));
			count2 += Integer.parseInt(m.substring(1,2));
		}
		String m = check(board[0][0], board[1][1], board[2][2]);
		
		count1 += Integer.parseInt(m.substring(0,1));
		count2 += Integer.parseInt(m.substring(1,2));
		
		String n = check(board[0][2], board[1][1], board[2][0]);
		
		count1 += Integer.parseInt(n.substring(0,1));
		count2 += Integer.parseInt(n.substring(1,2));
		
		out.println(count1);
		out.println(count2);
		
		in.close();
		out.close();
	}
	
	
	public static String check(char first, char second, char third) {
		String result = "";
		int count1 = 0;
		int count2 = 0;
		TreeSet<Character> team = new TreeSet<>();
		
		team.add(first);
		team.add(second);
		team.add(third);
		
		if(team.size() == 1) {
			count1++;
		}
		
		else if(team.size() == 2) {
			count2++;
		}
		
		result += count1;
		result += count2;
		
		return result;
	}
}

