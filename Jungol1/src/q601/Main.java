package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c[] = new char[str.length()];
		char cg = ' ';

		for (int i = 0; i < str.length(); i++) {
			c[i] = str.charAt(i);
		}
		
		
		sc.close();
		for (int k = 0; k < str.length(); k++) {
			for (int i = str.length() - 1; i >= 0; i--) {
				if (i == str.length() - 1) {
					cg = c[i];
				}
				if (i > 0) {
					c[i] = c[i - 1];
				} else if (i == 0) {
					c[i] = cg;
				}
			}

			for (int i = 0; i < str.length(); i++) {
				System.out.print(c[i]);
			}
			System.out.println();
		}
		
		

	}

}
