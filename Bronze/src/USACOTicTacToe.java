import java.util.*;
import java.io.*;
import java.io.*;
public class USACOTicTacToe {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("tttt.in"));
		PrintWriter out = new PrintWriter("tttt.out");
		
		int count1 = 0; 
		int count2 = 0;
		
		String[][] board = new String[3][3];
		
		for(int a = 0; a<3; a++) {
			board[a] = in.nextLine().split("");
		}
		
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		
		for(int a = 0; a<3; a++) {
			ArrayList<String> ss = new ArrayList<>();
			for(int b = 0; b<3; b++) {
				if(!ss.contains(board[a][b])) {
					ss.add(board[a][b]);
				}
			}
			result.add(ss);
		}
		
		for(int a = 0; a<3; a++) {
			ArrayList<String> ss = new ArrayList<>();
			for(int b = 0; b<3; b++) {
				if(!ss.contains(board[b][a])) {
					ss.add(board[b][a]);
				}
			}
			result.add(ss);
		}
		ArrayList<String> sss = new ArrayList<>();
		for(int r = 0; r<3; r++) {

			if(!sss.contains(board[r][r])) {
				sss.add(board[r][r]);
			}
		}
		
		result.add(sss);
		
		ArrayList<String> ssss = new ArrayList<>();
		for(int r = 0; r<3; r++) {
			if(!ssss.contains(board[r][2-r])) {
				ssss.add(board[r][2-r]);
			}
		}
		
		result.add(ssss);
		
		ArrayList<ArrayList<String>> temp = new ArrayList<>();
		
		for(ArrayList<String> j : result) {
			Collections.sort(j);
			if(j.size() == 1 && !temp.contains(j)) {
				count1++;
				temp.add(j);
			}
			else if(j.size() == 2 && !temp.contains(j)) {
				count2++;
				temp.add(j);
			}
		}
		
		out.println(count1);
		out.println(count2);
		
		in.close();
		out.close();
	}
}

