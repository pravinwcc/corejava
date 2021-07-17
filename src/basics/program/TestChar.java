package basics.program;

import java.util.Arrays;

public class TestChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[] = ("Pravin Kumar Singh").toCharArray();
		int count[] = new int[256];
		Arrays.fill(count, 0);
		for (int i = 0; i < str.length; i++) {
			count[str[i]]++;

		}
		
		for (int i = 0; i < 256; i++) {
			if(count[i]!=0)
			System.out.println(count[i]);
		}
	}

}
