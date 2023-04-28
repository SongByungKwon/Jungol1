package q529;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); //키
		int n = sc.nextInt(); //몸무게
		sc.close();
		int all= n+100-i;// 비만도
		
		System.out.printf("%d\n",all); //몸무게+100-키
		
		if(all>0) {      //몸무게+100-키>0
			System.out.printf("Obesity");
		}
		else {
		}
	}
}
