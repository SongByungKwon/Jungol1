package q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("yard? ");
		Scanner sc = new Scanner(System.in);
		double cm = sc.nextDouble();
		sc.close();
		System.out.printf("%.1fyard = %.1fcm",cm,cm*91.44);

	}

}
