package q575;

import java.util.Scanner;

class Gob {
	int i;
	int j;
	int hap;

	int setGob(int i, int j, int hap) {
		this.i = i;
		this.j = j;
		this.hap = hap;
		for (int z = 1; z < j; z++) {
			hap = hap * i;
		}
		return hap;
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int hap = num1;
		sc.close();

		Gob myGob = new Gob();

		hap = myGob.setGob(num1, num2, hap);
		if (num2 == 0) {
			hap = 1;
		}
		System.out.println(hap);

	}

}
