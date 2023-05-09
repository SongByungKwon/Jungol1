package q9035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("세 수를 입력하세요. ");
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		sc.close();
		if(a>b&&a>c) {
			System.out.printf("입력받은 수중 가장 큰 수는 %d입니다.",a);
		}
		else if(b>a&&b>c) {
			System.out.printf("입력받은 수중 가장 큰 수는 %d입니다.",b);
		}
		else if(c>a&&c>b) {
			System.out.printf("입력받은 수중 가장 큰 수는 %d입니다.",c);
		}

	}

}
