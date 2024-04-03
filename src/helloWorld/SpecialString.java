package helloWorld;
import java.util.*;

	
	public class SpecialString {

		public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			System.out.print("Give me an String Input : ");
			String input = scnr.nextLine();
			scnr.close();

			String output = specialString(input);
			System.out.println("Special String Output: " + output);
		}

		public static String specialString(String input) {
			StringBuilder output = new StringBuilder();
			int count = 1;

			for (char c : input.toCharArray()) {
				if (Character.isWhitespace(c)) {
					if (count == 1) {
						output.append("*");
					} else if (count == 2) {
						output.append("##");
					} else if (count == 3) {
						output.append("***");
					} else {
						output.append("####");
					}
					count++;
				} else {
					output.append(c);
				}
			}

			return output.toString();

		}
	}
	
		