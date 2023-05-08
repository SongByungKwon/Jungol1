package q9033;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		num=num/10;
		switch(num) {
		case 10 :
		  System.out.println("A");
		  break;
		case 9 :
			  System.out.println("A");
			  break;
		case 8 :
			  System.out.println("B");
			  break;
		case 7 :
			  System.out.println("C");
			  break;
		case 6 :
			  System.out.println("D");
			  break;
		default :
			  System.out.println("F");
			  break;
		}
		

	}

}
