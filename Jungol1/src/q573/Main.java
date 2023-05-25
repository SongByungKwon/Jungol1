package q573;

import java.util.Scanner;

class Num {

	int num;
	int cut = 1;

	void setNum(int num) {
		this.num = num;
	}

	void print() {
		for (int j = 0; j < num; j++) {
			for (int i = 0; i < num; i++) {
				System.out.print(cut + " ");
				cut++;

			}
			System.out.println();
		}

	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		Num num = new Num();

		num.setNum(n);

		num.print();

	}

}
