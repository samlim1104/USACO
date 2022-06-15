import java.util.*;
public class FileExtensions {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numFiles = Integer.parseInt(in.nextLine());
		ArrayList<String> files = new ArrayList<>();
		for(int i = 0; i<numFiles; i++) {
			boolean r = false;
			String[] n = in.nextLine().split(".");
			
			if(i==0) files.add(n[1]);
			
			else{
				for(int a = 0; a<files.size(); a++) {
				if(n[1].equals(files.get(a))) {
					r = true;
				}
			}
			}
			
			if(!r) {
				files.add(n[1]);
			}
		}
		
		for(String w : files) {
			System.out.println(w);
		}
	}
}
