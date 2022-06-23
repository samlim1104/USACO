import java.io.*;
import java.util.*;

public class CFWhiteSheet {
	public static void main(String[] args)throws IOException{
		Scanner in = new Scanner(System.in);
		
		int wBLx = in.nextInt();
		int wBLy = in.nextInt();
		int wTRx = in.nextInt();
		int wTRy = in.nextInt();
		
		int b1BLx = in.nextInt();
		int b1BLy = in.nextInt();
		int b1TRx = in.nextInt();
		int b1TRy = in.nextInt();
		
		int b2BLx = in.nextInt();
		int b2BLy = in.nextInt();
		int b2TRx = in.nextInt();
		int b2TRy = in.nextInt();
		
		if(b1BLx <= wBLx && b1BLy <= wBLy && b1TRx >= wTRx && b1TRy >= wTRy) {
			System.out.println("NO");
		}
		else if(b2BLx <= wBLx && b2BLy <= wBLy && b2TRx >= wTRx && b2TRy >= wTRy) {
			System.out.println("NO");
		}
		else if(b1BLx <= wBLx && b1BLy <= wBLy && b1TRx < wTRx && b1TRx > wBLx && b1TRy >= wTRy && b2BLx <= b1TRx && b2BLy <= wBLy && b2TRx >= wTRx && b2TRy >= wTRy) {
			System.out.println("NO");
		}
		else if(b2BLx <= wBLx && b2BLy <= wBLy && b2TRx < wTRx && b2TRx > wBLx && b2TRy >= wTRy && b1BLx <= b2TRx && b1BLy <= wBLy && b1TRx >= wTRx && b1TRy >= wTRy) {
			System.out.println("NO");
		}
		else if(b1BLx <= wBLx && b1BLy < wTRy && b1BLy > wBLy && b1TRx >= wTRx && b1TRy >= wTRy && b2BLx <= wBLx && b2BLy <= wBLy && b2TRx >= wTRx && b2TRy >= b1BLy) {
			System.out.println("NO");
		}
		else if(b2BLx <= wBLx && b2BLy < wTRy && b2BLy > wBLy && b2TRx >= wTRx && b2TRy >= wTRy && b1BLx <= wBLx && b1BLy <= wBLy && b1TRx >= wTRx && b1TRy >= b2BLy) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}
