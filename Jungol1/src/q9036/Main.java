package q9036;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1. 삽입");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.print("숫자를 선택하세요. ");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		switch(num) {
		case 1:
			System.out.println("삽입을 선택하셨습니다.");
			break;
		case 2:
			System.out.println("수정을 선택하셨습니다.");
			break;
		case 3:
			System.out.println("삭제을 선택하셨습니다.");
			break;
		}

	}

}
