package q9032;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요."+" ");
		Scanner sc =new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		if(i>=80) {
			System.out.print("축하합니다. 합격입니다."+" ");
		}
		else {
			System.out.print("죄송합니다. 불합격입니다."+" ");
		}

	}

}
