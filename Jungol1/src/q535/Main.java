package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		sc.close();

		if (i > 0 && i <= 4.5) {
			switch ((int) i) {
			case 5:
			case 4:
				System.out.print("scholarship");
				break;
			case 3:
				System.out.print("next semester");
				break;

			case 2:
				System.out.print("seasonal semester");
				break;
			default:
				System.out.print("retake");
				break;

			}
		}

	}

}
