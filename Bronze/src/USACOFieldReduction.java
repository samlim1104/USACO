import java.util.*;
import java.io.*;
public class USACOFieldReduction {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("reduce.in"));
		PrintWriter out = new PrintWriter("reduce.out");
		
		int cows = in.nextInt();
		
		ArrayList<Integer> xs = new ArrayList<>();
		ArrayList<Integer> ys = new ArrayList<>();
		
		for(int i = 0; i<cows; i++) {
			xs.add(in.nextInt());
			ys.add(in.nextInt());
		}
		
		int maxA = 0;
		
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		
		for(int i = 0; i<cows; i++) {
			x.add(xs.get(i));
			y.add(ys.get(i));
		}
		
		int maxx = Integer.MIN_VALUE;
		int maxxInd = 0;
		for(int r = 0; r<3; r++) {
			for(int i = 0; i<x.size(); i++) {
				if(x.get(i) > maxx) {
					maxx = x.get(i);
					maxxInd = i;
				}
			}
			maxx = Integer.MIN_VALUE;
			x.remove(maxxInd);
			y.remove(maxxInd);
		}
		
		maxA = Math.min(maxA, findArea(x, y));
		
		ArrayList<Integer> xx = new ArrayList<>();
		ArrayList<Integer> yy = new ArrayList<>();
		
		for(int i = 0; i<cows; i++) {
			xx.add(xs.get(i));
			yy.add(ys.get(i));
		}
		
		int maxy = Integer.MIN_VALUE;
		int maxyInd = 0;
		for(int r = 0; r<3; r++) {
			for(int i = 0; i<yy.size(); i++) {
				if(yy.get(i) > maxy) {
					maxy = yy.get(i);
					maxyInd = i;
				}
			}
			maxy = Integer.MIN_VALUE;
			yy.remove(maxyInd);
			xx.remove(maxyInd);
		}
		
		maxA = Math.min(maxA,  findArea(xx, yy));
		
		ArrayList<Integer> x2 = new ArrayList<>();
		ArrayList<Integer> y2 = new ArrayList<>();
		
		for(int i = 0; i<cows; i++) {
			x2.add(xs.get(i));
			y2.add(ys.get(i));
		}
		
		int minx = Integer.MAX_VALUE;
		int minxInd = 0;
		for(int r = 0; r<3; r++) {
			for(int i = 0; i<x2.size(); i++) {
				if(x2.get(i) < minx) {
					minx = x2.get(i);
					minxInd = i;
				}
			}
			minx = Integer.MAX_VALUE;
			x2.remove(minxInd);
			y2.remove(minxInd);
		}
		
		maxA = Math.min(maxA, findArea(x2, y2));
		
		ArrayList<Integer> xx2 = new ArrayList<>();
		ArrayList<Integer> yy2 = new ArrayList<>();
		
		for(int i = 0; i<cows; i++) {
			xx2.add(xs.get(i));
			yy2.add(ys.get(i));
		}
		
		int miny = Integer.MAX_VALUE;
		int minyInd = 0;
		for(int r = 0; r<3; r++) {
			for(int i = 0; i<yy2.size(); i++) {
				if(yy2.get(i) < miny) {
					miny = yy2.get(i);
					minyInd = i;
				}
			}
			miny = Integer.MAX_VALUE;
			yy2.remove(minyInd);
			xx2.remove(minyInd);
		}
		
		maxA = Math.min(maxA, findArea(x2, y2));
		
		out.println(maxA);
		
		out.close();
	}
	
	public static int findArea(List<Integer> firstx, List<Integer> firsty) {
		int mx = Integer.MIN_VALUE;
		int my = Integer.MIN_VALUE;
		int lx = Integer.MAX_VALUE;
		int ly = Integer.MAX_VALUE;
		
		for(int i = 0; i<firstx.size(); i++) {
			mx = Math.max(mx, firstx.get(i));
		}
		for(int i = 0; i<firstx.size(); i++) {
			lx = Math.min(lx, firstx.get(i));
		}
		for(int i = 0; i<firsty.size(); i++) {
			my = Math.max(my, firsty.get(i));
		}
		for(int i = 0; i<firsty.size(); i++) {
			lx = Math.min(lx, firsty.get(i));
		}
		
		return (mx-lx) * (my-ly);
	}
}
