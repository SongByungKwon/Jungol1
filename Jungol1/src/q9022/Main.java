package q9022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int c =++a + b--;
		System.out.printf("a = %d, b = %d, c = %d", a,b,c);

	}

}
