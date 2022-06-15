import java.util.*;
public class Quebec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			int num = Integer.parseInt(in.nextLine());
			for(int s = 0; s<num; s++) {
			if(num > 1) {
				String word = in.nextLine();
				word = word.toLowerCase();
				for(int a = 0; a<word.length(); a++) {
					if(a != word.length()-1 && !word.substring(a+1, a+2).equals(" ")) {
					if(word.substring(a, a+1).equals(" ")) {
						System.out.print(" ");
					}
					if(word.substring(a, a+1).equals("a")) {
						System.out.print("Alpha-");
					}
					if(word.substring(a, a+1).equals("b")) {
						System.out.print("Bravo-");
					}
					if(word.substring(a, a+1).equals("c")) {
						System.out.print("Charlie-");
					}
					if(word.substring(a, a+1).equals("d")) {
						System.out.print("Delta-");
					}
					if(word.substring(a, a+1).equals("e")) {
						System.out.print("Echo-");
					}
					if(word.substring(a, a+1).equals("f")) {
						System.out.print("Foxtrot-");
					}
					if(word.substring(a, a+1).equals("g")) {
						System.out.print("Golf-");
					}
					if(word.substring(a, a+1).equals("h")) {
						System.out.print("Hotel-");
					}
					if(word.substring(a, a+1).equals("i")) {
						System.out.print("India-");
					}
					if(word.substring(a, a+1).equals("j")) {
						System.out.print("Juliet-");
					}
					if(word.substring(a, a+1).equals("k")) {
						System.out.print("Kilo-");
					}
					if(word.substring(a, a+1).equals("l")) {
						System.out.print("Lima-");
					}
					if(word.substring(a, a+1).equals("m")) {
						System.out.print("Mike-");
					}
					if(word.substring(a, a+1).equals("n")) {
						System.out.print("November-");
					}
					if(word.substring(a, a+1).equals("o")) {
						System.out.print("Oscar-");
					}
					if(word.substring(a, a+1).equals("p")) {
						System.out.print("Papa-");
					}
					if(word.substring(a, a+1).equals("q")) {
						System.out.print("Quebec-");
					}
					if(word.substring(a, a+1).equals("r")) {
						System.out.print("Romeo-");
					}
					if(word.substring(a, a+1).equals("s")) {
						System.out.print("Sierra-");
					}
					if(word.substring(a, a+1).equals("t")) {
						System.out.print("Tango-");
					}
					if(word.substring(a, a+1).equals("u")) {
						System.out.print("Uniform-");
					}
					if(word.substring(a, a+1).equals("v")) {
						System.out.print("Victor-");
					}
					if(word.substring(a, a+1).equals("w")) {
						System.out.print("Whiskey-");
					}
					if(word.substring(a, a+1).equals("x")) {
						System.out.print("Xray-");
					}
					if(word.substring(a, a+1).equals("y")) {
						System.out.print("Yankee-");
					}
					if(word.substring(a, a+1).equals("z")) {
						System.out.print("Zulu-");
					}
					}
					if(a == word.length()-1 || (a != word.length()-1 && word.substring(a+1, a+2).equals(" "))) {
						if(word.substring(a, a+1).equals("a")) {
							System.out.print("Alpha");
						}
						if(word.substring(a, a+1).equals("b")) {
							System.out.print("Bravo");
						}
						if(word.substring(a, a+1).equals("c")) {
							System.out.print("Charlie");
						}
						if(word.substring(a, a+1).equals("d")) {
							System.out.print("Delta");
						}
						if(word.substring(a, a+1).equals("e")) {
							System.out.print("Echo");
						}
						if(word.substring(a, a+1).equals("f")) {
							System.out.print("Foxtrot");
						}
						if(word.substring(a, a+1).equals("g")) {
							System.out.print("Golf");
						}
						if(word.substring(a, a+1).equals("h")) {
							System.out.print("Hotel");
						}
						if(word.substring(a, a+1).equals("i")) {
							System.out.print("India");
						}
						if(word.substring(a, a+1).equals("j")) {
							System.out.print("Juliet");
						}
						if(word.substring(a, a+1).equals("k")) {
							System.out.print("Kilo");
						}
						if(word.substring(a, a+1).equals("l")) {
							System.out.print("Lima");
						}
						if(word.substring(a, a+1).equals("m")) {
							System.out.print("Mike");
						}
						if(word.substring(a, a+1).equals("n")) {
							System.out.print("November");
						}
						if(word.substring(a, a+1).equals("o")) {
							System.out.print("Oscar");
						}
						if(word.substring(a, a+1).equals("p")) {
							System.out.print("Papa");
						}
						if(word.substring(a, a+1).equals("q")) {
							System.out.print("Quebec");
						}
						if(word.substring(a, a+1).equals("r")) {
							System.out.print("Romeo");
						}
						if(word.substring(a, a+1).equals("s")) {
							System.out.print("Sierra");
						}
						if(word.substring(a, a+1).equals("t")) {
							System.out.print("Tango");
						}
						if(word.substring(a, a+1).equals("u")) {
							System.out.print("Uniform");
						}
						if(word.substring(a, a+1).equals("v")) {
							System.out.print("Victor");
						}
						if(word.substring(a, a+1).equals("w")) {
							System.out.print("Whiskey");
						}
						if(word.substring(a, a+1).equals("x")) {
							System.out.print("Xray");
						}
						if(word.substring(a, a+1).equals("y")) {
							System.out.print("Yankee");
						}
						if(word.substring(a, a+1).equals("z")) {
							System.out.print("Zulu");
						}
					}
				}
				System.out.println();
			}
			else {
				String word = in.nextLine();
				word = word.toLowerCase();
				for(int a = 0; a<word.length(); a++) {
					if(a != word.length()-1) {
					if(word.substring(a, a+1).equals("a")) {
						System.out.print("Alpha-");
					}
					if(word.substring(a, a+1).equals("b")) {
						System.out.print("Bravo-");
					}
					if(word.substring(a, a+1).equals("c")) {
						System.out.print("Charlie-");
					}
					if(word.substring(a, a+1).equals("d")) {
						System.out.print("Delta-");
					}
					if(word.substring(a, a+1).equals("e")) {
						System.out.print("Echo-");
					}
					if(word.substring(a, a+1).equals("f")) {
						System.out.print("Foxtrot-");
					}
					if(word.substring(a, a+1).equals("g")) {
						System.out.print("Golf-");
					}
					if(word.substring(a, a+1).equals("h")) {
						System.out.print("Hotel-");
					}
					if(word.substring(a, a+1).equals("i")) {
						System.out.print("India-");
					}
					if(word.substring(a, a+1).equals("j")) {
						System.out.print("Juliet-");
					}
					if(word.substring(a, a+1).equals("k")) {
						System.out.print("Kilo-");
					}
					if(word.substring(a, a+1).equals("l")) {
						System.out.print("Lima-");
					}
					if(word.substring(a, a+1).equals("m")) {
						System.out.print("Mike-");
					}
					if(word.substring(a, a+1).equals("n")) {
						System.out.print("November-");
					}
					if(word.substring(a, a+1).equals("o")) {
						System.out.print("Oscar-");
					}
					if(word.substring(a, a+1).equals("p")) {
						System.out.print("Papa-");
					}
					if(word.substring(a, a+1).equals("q")) {
						System.out.print("Quebec-");
					}
					if(word.substring(a, a+1).equals("r")) {
						System.out.print("Romeo-");
					}
					if(word.substring(a, a+1).equals("s")) {
						System.out.print("Sierra-");
					}
					if(word.substring(a, a+1).equals("t")) {
						System.out.print("Tango-");
					}
					if(word.substring(a, a+1).equals("u")) {
						System.out.print("Uniform-");
					}
					if(word.substring(a, a+1).equals("v")) {
						System.out.print("Victor-");
					}
					if(word.substring(a, a+1).equals("w")) {
						System.out.print("Whiskey-");
					}
					if(word.substring(a, a+1).equals("x")) {
						System.out.print("Xray-");
					}
					if(word.substring(a, a+1).equals("y")) {
						System.out.print("Yankee-");
					}
					if(word.substring(a, a+1).equals("z")) {
						System.out.print("Zulu-");
					}
					}
					if(a == word.length()-1) {
						if(word.substring(a, a+1).equals("a")) {
							System.out.print("Alpha");
						}
						if(word.substring(a, a+1).equals("b")) {
							System.out.print("Bravo");
						}
						if(word.substring(a, a+1).equals("c")) {
							System.out.print("Charlie");
						}
						if(word.substring(a, a+1).equals("d")) {
							System.out.print("Delta");
						}
						if(word.substring(a, a+1).equals("e")) {
							System.out.print("Echo");
						}
						if(word.substring(a, a+1).equals("f")) {
							System.out.print("Foxtrot");
						}
						if(word.substring(a, a+1).equals("g")) {
							System.out.print("Golf");
						}
						if(word.substring(a, a+1).equals("h")) {
							System.out.print("Hotel");
						}
						if(word.substring(a, a+1).equals("i")) {
							System.out.print("India");
						}
						if(word.substring(a, a+1).equals("j")) {
							System.out.print("Juliet");
						}
						if(word.substring(a, a+1).equals("k")) {
							System.out.print("Kilo");
						}
						if(word.substring(a, a+1).equals("l")) {
							System.out.print("Lima");
						}
						if(word.substring(a, a+1).equals("m")) {
							System.out.print("Mike");
						}
						if(word.substring(a, a+1).equals("n")) {
							System.out.print("November");
						}
						if(word.substring(a, a+1).equals("o")) {
							System.out.print("Oscar");
						}
						if(word.substring(a, a+1).equals("p")) {
							System.out.print("Papa");
						}
						if(word.substring(a, a+1).equals("q")) {
							System.out.print("Quebec");
						}
						if(word.substring(a, a+1).equals("r")) {
							System.out.print("Romeo");
						}
						if(word.substring(a, a+1).equals("s")) {
							System.out.print("Sierra");
						}
						if(word.substring(a, a+1).equals("t")) {
							System.out.print("Tango");
						}
						if(word.substring(a, a+1).equals("u")) {
							System.out.print("Uniform");
						}
						if(word.substring(a, a+1).equals("v")) {
							System.out.print("Victor");
						}
						if(word.substring(a, a+1).equals("w")) {
							System.out.print("Whiskey");
						}
						if(word.substring(a, a+1).equals("x")) {
							System.out.print("Xray");
						}
						if(word.substring(a, a+1).equals("y")) {
							System.out.print("Yankee");
						}
						if(word.substring(a, a+1).equals("z")) {
							System.out.print("Zulu");
						}
					}
				}
			}
		}
		}
	}
}
