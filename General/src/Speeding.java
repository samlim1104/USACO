import java.util.*;
public class Speeding {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			
			String[] array = in.nextLine().split(" ");
			
			int speed = Integer.parseInt(array[0]);
			String birthday = array[1];
			
			if(birthday.equals("true")) {
				if(speed <= 65) {
					System.out.println("no ticket");
				}
				else if(speed > 65 && speed <= 85) {
					System.out.println("small ticket");
				}
				else if(speed > 85) {
					System.out.println("big ticket");
				}
			}
			else {
				if(speed <= 60) {
					System.out.println("no ticket");
				}
				else if(speed > 60 && speed <= 80) {
					System.out.println("small ticket");
				}
				else if(speed > 80) {
					System.out.println("big ticket");
				}
			}
		}
	}
}
