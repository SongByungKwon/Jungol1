package q9023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int num3 =sc.nextInt();
		sc.close();
		
		int a=(num1==num2)? 1:0;
		System.out.print(a+" ");
		a=(num2==num3)? 1:0;
		System.out.print(a+" ");
		a=(num1!=num2)? 1:0;
		System.out.print(a+" ");
		a=(num2!=num3)? 1:0;
		System.out.print(a+" ");
	}

}
