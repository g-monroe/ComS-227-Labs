package lab6;

import java.util.Scanner;

public class checkPointOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		System.out.println(grabFirstLetter(input));
		System.out.println(findVowel(input));
		scan.close();
	}
	private static String grabFirstLetter(String input) {
		String output = "";
		String[] arr = input.split(" ");
		 for (int i = 0; i<arr.length; i++) {
			 output = output + arr[i].charAt(0);
		 }
		return output;
	}
	private static int findVowel(String input) {
		input = input.toLowerCase();
		for(int i = 0; i<input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i') {
				return i;
			}else if (input.charAt(i) == 'o' || input.charAt(i) == 'u') {
				return i;
			}
		}
		return -1;
	}
}
