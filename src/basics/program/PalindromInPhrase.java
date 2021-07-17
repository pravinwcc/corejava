package basics.program;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
import java.io.*;

public class PalindromInPhrase {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("Palindrome.txt"));
		PrintStream out = new PrintStream(new File("palsout.txt"));
		boolean palin;
		String input, reveresed;
		input = in.readLine();
		while (input != null) {
			if (isPalindrome(input))
				out.println(input + " is a Palindrome");
			else
				out.println(input + " is not a Palindrome");
			input = in.readLine();
		}
	}

	/**
	 * The return value is true if and only if the input string is a palindrome.
	 * All non-letters is ignored, and the case of the letters is also ignored.
	 **/
	public static boolean isPalindrome(String input) {
		Queue<Character> q = new LinkedList<Character>();
		Stack<Character> s = new Stack<Character>();
		Character letter; // One character from the input string
		int mismatches = 0; // Number of spots that mismatched
		int i; // Index for the input string
		for (i = 0; i < input.length(); i++) {
			letter = input.charAt(i);
			if (Character.isLetter(letter)) {// discard space
				q.add(letter);//add sentence without space
				s.push(letter);// make sentence reverse 
			}
		}
		while (!q.isEmpty()) {
			if (q.remove() != s.pop())
				mismatches++;
		}
		// If there were no mismatches, then the string was a palindrome.
		return (mismatches == 0);
	}
}
