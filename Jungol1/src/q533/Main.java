package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char c = sc.next().charAt(0);
		int num = sc.nextInt();
//		sc.close();
//		
//		if(c=='M') {
//			if(num >=18) {
//				System.out.println("MAN");
//			}
//			else {
//				System.out.println("BOY");
//			}
//				
//		}
//		else if(c=='F'){
//			if(num >=18) {
//				System.out.println("WOMAN");
//			}
//			else {
//				System.out.println("GIRL");
//			}
//			
//		}
//
//	}
//
//}


		if(c=='M') {
		String a=(num>=18)?"MAN":"BOY";
		System.out.printf("%s",a);
		}
		else {
			String a=(num>=18)?"WOMAN":"GIRL";
			System.out.printf("%s",a);
		}
		sc.close();
	}
}
