package q9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("키를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int ki = sc.nextInt();
		
		System.out.print("몸무게를 입력하세요. ");
		double mom  = sc.nextDouble();
		
		System.out.print("이름을 입력하세요. ");
		String name  = sc.next();
		sc.close();
		
		System.out.printf("키 = %d\n",ki);
		System.out.printf("몸무게 = %.1f\n",mom);
		System.out.printf("이름 = %s",name);
	}

}
