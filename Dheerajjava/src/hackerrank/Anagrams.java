package hackerrank;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	static boolean isAnagram(String a, String b) {
		int a_length = a.length();
		int b_length = b.length();
		if (a_length != b_length) {
			return false;

		}
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		int[] char_frequencies = new int[26];
		for (int i = 0; i < a_length; i++) {
			char current_character = a.charAt(i);
			int index = current_character - 'a';
			char_frequencies[index]++;
		}
		for (int i = 0; i < b_length; i++) {
			char current_character = b.charAt(i);
			int index = current_character - 'a';
			char_frequencies[index]--;
		}
		for (int i = 0; i < 26; i++) {
			if (char_frequencies[i] != 0) {
				return false;
			}
		}
		return true;

	}
}