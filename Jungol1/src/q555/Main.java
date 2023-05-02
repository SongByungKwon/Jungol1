package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char c[] = new char[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
			System.out.printf("%c", c[i]);
		}
		sc.close();
	}

}
