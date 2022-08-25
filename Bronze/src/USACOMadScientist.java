import java.io.*;
import java.util.*;
public class USACOMadScientist {
	public static void main(String[] args) throws IOException {
		Scanner io = new Scanner(new FileReader("breedflip.in"));
		PrintWriter out = new PrintWriter("breedflip.out");
		int n = io.nextInt();
		char[] a = io.next().toCharArray();
		char[] b = io.next().toCharArray();
		int ret = 0;
		while (!new String(a).equals(new String(b))) {
			ret++;
			int lhs = 0;
			while (a[lhs] == b[lhs]) lhs++;
			int rhs = n-1;
			while (a[rhs] == b[rhs]) rhs--;
			for (int i = lhs; i <= rhs; i++) {
				if (a[i] == 'G') a[i] = 'H';
				else a[i] = 'G';
			}
		}
		out.println(ret);
		io.close();
		out.close();
	}
}