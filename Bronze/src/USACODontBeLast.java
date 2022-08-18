import java.util.*;
import java.io.*;
public class USACODontBeLast {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");
		
		int N = in.nextInt();
		Set<String> set = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 1; i<N+1; i++) {
			String name = in.next();
			int milk = in.nextInt();
			
			if(!set.contains(name)) {
				set.add(name);
				map.put(name.charAt(0)-97, milk);
			}
			else {
				int tot = map.get(name.charAt(0)-97) + milk;
				map.replace(name.charAt(0)-97, tot);
			}
		}
		
		Map<Integer, Integer> result = new TreeMap<>();
		
		for(int i = 0; i<map.size(); i++) {
			result.put(i, )
		}
	}
}
