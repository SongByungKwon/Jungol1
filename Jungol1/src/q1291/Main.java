package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int e = sc.nextInt();

		while (true) {
			if ((2 <= s && s <= 9) && (2 <= e && e <= 9)) {
				if (s <= e) {
					for (int n = 1; n <= 9; n++) {
						for (int m = s; m <= e; m++) {
							System.out.printf("%d * %d = %2d   ", m, n, m * n);
						}
						System.out.println();
					}
				} else if (s >= e) {
					for (int n = 1; n <= 9; n++) {
						for (int m = s; m >= e; m--) {
							System.out.printf("%d * %d = %2d   ", m, n, m * n);
						}
						System.out.println();
					}
				}
				break;

			} else {
				System.out.println("INPUT ERROR!");
				s = sc.nextInt();
				e = sc.nextInt();
			}
		}
		sc.close();
	}
}
