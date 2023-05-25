package q571;

import java.util.Scanner;


class MainExample {
	void monja() {
		System.out.println("~!@#$^&*()_+|");
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		sc.close();
		MainExample myMain =new MainExample();
		for(int i=1;i<=num;i++) {
		myMain.monja();
		}
	}

}