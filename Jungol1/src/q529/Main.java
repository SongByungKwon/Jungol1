package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); //키
		int n = sc.nextInt(); //몸무게
		sc.close();
		
		System.out.printf("%d\n",n+100-i); //몸무게+100-키
		
		if(n+100-i>0) {      //몸무게+100-키>0
			System.out.printf("Obesity");
		}
		else {
		}
	}
}
