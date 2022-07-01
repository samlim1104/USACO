import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] nu = in.nextLine().split(" ");
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i = 0; i<nu.length; i++) {
			nums.add(Integer.parseInt(nu[i]));
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int indexMin = 0;
		int indexMax = 0;
		
		for(int u = 0; u<nums.size(); u++) {
			if(nums.get(u) < min) {
				min = nums.get(u);
				indexMin =u;
			}
		}
		
		nums.remove(indexMin);
		
		for(int o = 0; o<nums.size(); o++) {
			if(nums.get(o) > max) {
				max = nums.get(o);
				indexMax = o;
			}
		}
		
		nums.remove(indexMax);
		
		int a = min;
		int b = 0;
		int c = 0;
		int bc = 0;
		int abc = max;
		
		bc = abc-a;
		
		for(int q = 0; q<nums.size()-1; q++) {
			for(int t = q + 1; t<nums.size(); t++) {
				if(nums.get(q) + nums.get(t) == bc) {
					if(nums.get(q) > nums.get(t)) {
						c = nums.get(q);
						b = nums.get(t);
					}
					else {
						c = nums.get(t);
						b = nums.get(q);
					}
				}
			}
		}
		
		System.out.println(a + " " + b + " " + c);
	}
}
