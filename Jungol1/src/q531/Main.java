package q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		if (d <= 50.8) {
			System.out.println("Flyweight");
		} else if (d <= 61.23) {
			System.out.println("Lightweight");
		} else if (d <= 72.57) {
			System.out.println("Middleweight");

		}

		else if (d <= 88.45) {
			System.out.println("Cruiserweight");

		} else {
			System.out.println("Heavyweight");
		}
		sc.close();
	}

}
