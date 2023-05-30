package q617;

import java.util.Scanner;

class Pl {
	String name[] = new String[5];
	int kz[] = new int[5];
	int cnt;

	public void Input(String name, int kz, int cnt) {

		this.name[cnt] = name;
		this.kz[cnt] = kz;
		this.cnt = cnt;

	}

	public void Chek() {

		if (this.kz[0] >= this.kz[cnt]) {
			this.name[0] = this.name[cnt];
			this.kz[0] = this.kz[cnt];
		} 

	}

	public void print() {
		System.out.print(this.name[0] + " " + this.kz[0]);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = new String[5];
		int ki[] = new int[5];

		Pl pc = new Pl();

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
			ki[i] = sc.nextInt();
			pc.Input(str[i], ki[i], i);
			if (i < 5) {
				pc.Chek();
			}
		}
		pc.print();
		sc.close();

	}

}
