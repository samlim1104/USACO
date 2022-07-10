import java.util.*;
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
		
		for(int i = 0; i<3; i++) {
			if(board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
				count1++;
			}
			else if(board[i][0].equals(board[i][1]) || board[i][0].equals(board[i][2]) || board[i][1].equals(board[i][2])) {
				count2++;
			}
		}
		
		for(int i = 0; i<3; i++) {
			if(board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) {
				count1++;
			}
			else if(board[0][i].equals(board[1][i]) || board[0][i].equals(board[2][i]) || board[1][i].equals(board[2][i])) {
				count2++;
			}
		}
		
		if(board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
			count1++;
		}
		else if(board[0][0].equals(board[1][1]) || board[0][0].equals(board[2][2]) || board[1][1].equals(board[2][2])) {
			count2++;
		}
		
		if(board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) {
			count1++;
		}
		else if(board[0][2].equals(board[1][1]) || board[0][2].equals(board[2][0]) || board[1][1].equals(board[2][0])) {
			count2++;
		}
		
		out.println(count1);
		out.println(count2);
		
		in.close();
		out.close();
	}
}

