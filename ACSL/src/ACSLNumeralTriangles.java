import java.util.*;
public class ACSLNumeralTriangles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
		String[] array = in.nextLine().split(" ");
		
		int start = Integer.parseInt(array[0], 8);
		int delta = Integer.parseInt(array[1], 8);
		
		int[] result = new int[Integer.parseInt(array[2])];
		
		for(int r = 0; r<Integer.parseInt(array[2]); r++) {
			int[] nums = new int[Integer.parseInt(array[2])];
			for(int c = 0; c<=r; c++) {
				nums[c] = start;
				
				start += delta;
			}
			result = nums;
		}
		
		for(int x = 0; x<result.length; x++) {
			result[x] = Integer.parseInt(Integer.toOctalString(result[x]));
		}
		
		int fin = 0;
		for(int q = 0; q<result.length; q++) {
			while(result[q] > 0) {
				fin += result[q] % 10;
				result[q] = result[q] / 10;
			}
		}
		
		System.out.println(fin);
		}
	}
}