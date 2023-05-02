package q9063;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num[] =new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<num.length;i++) {
			num[i] = sc.nextInt();
			System.out.print(num[i]+" ");
		}
		sc.close();

	}

}
