package q9019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("5개의 수를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		int num4= sc.nextInt();
		int num5= sc.nextInt();
		sc.close();
		
		System.out.printf("%d ",num1+3);
		System.out.printf("%d ",num2-3);
		System.out.printf("%d ",num3*3);
		System.out.printf("%d ",num4/3);
		System.out.printf("%d ",num5%3);

	}

}
