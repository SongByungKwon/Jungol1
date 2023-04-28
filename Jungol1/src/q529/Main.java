package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		System.out.printf("%d\n",n+100-i);
		
		if(n+100-i>0) {
			System.out.printf("Obesity");
		}
		else {
		}
		

	}

}
