import java.util.*;
public class ChineseZodiac {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<testCases; i++) {
			int year = Integer.parseInt(in.nextLine());
			
			String yinyang = "";
			
			if(year % 2 == 0) {
				yinyang = "Yang";
			}
			else {
				yinyang = "Yin";
			}
			
			int zodiacyear = year-4;
			
			int element = zodiacyear;
			
			element %= 10;
			element /= 2;
			
			String elements = "";
			
			if(element == 0) {
				elements = "Wood";
			}
			else if(element == 1) {
				elements = "Fire";
			}
			else if(element == 2) {
				elements = "Earth";
			}
			else if(element == 3) {
				elements = "Metal";
			}
			else if(element == 4) {
				elements = "Water";
			}
			
			String animal = "";
			
			int animalyear = zodiacyear;
			
			animalyear %= 12;
			
			if(animalyear == 0) {
				animal = "Rat";
			}
			else if(animalyear == 1) {
				animal = "Ox";
			}
			else if(animalyear == 2) {
				animal = "Tiger";
			}
			else if(animalyear == 3) {
				animal = "Rabbit";
			}
			else if(animalyear == 4) {
				animal = "Dragon";
			}
			else if(animalyear == 5) {
				animal = "Snake";
			}
			else if(animalyear == 6) {
				animal = "Horse";
			}
			else if(animalyear == 7) {
				animal = "Goat";
			}
			else if(animalyear == 8) {
				animal = "Monkey";
			}
			else if(animalyear == 9) {
				animal = "Rooster";
			}
			else if(animalyear == 10) {
				animal = "Dog";
			}
			else if(animalyear == 11) {
				animal = "Pig";
			}
			
			System.out.println(year + " " + yinyang + " " + elements + " " + animal);
		}
	}
}
