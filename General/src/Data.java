import java.util.*;

public class Data {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			int numOfRecords = Integer.parseInt(in.nextLine());
			
			for(int y = 0; y<numOfRecords; y++) {
				String[] array = in.nextLine().split(" ");
				
				if(!array[0].substring(array[0].length()-9, array[0].length()).equals(".lmco.com")) {
					int data = Integer.parseInt(array[1]);
					
					if(data > 1000) {
						System.out.println(array[0] + " " + array[1]);
					}
				}
			}
		}
	}
}
