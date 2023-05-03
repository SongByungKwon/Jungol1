package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num1 = sc.nextInt();
			i = i + num1;
			c++;
			if (num1 > 100) {
				break;
			}

		}
		System.out.printf("sum : %d", i);
		System.out.printf("avg : %.1f", i / (double) c);
		sc.close();

	}

}
