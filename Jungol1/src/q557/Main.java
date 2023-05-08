package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char c[]=new char[10];
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<10;i++) {
			c[i] = sc.next().charAt(0);
		}
		System.out.printf("%c %c %c",c[0],c[3],c[6]);
		sc.close();

	}

}
