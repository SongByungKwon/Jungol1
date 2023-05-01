package q9109;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		String c = sc.nextLine();
//		sc.close();
//		System.out.println(c);
		
		
		String str = "";
		while(true) {
			String inp = sc.next();
		char c = inp.charAt(0);
		
		
		if(('A' <= c &&c <='Z')||('a' <= c&&c <='z')) {
			str +=c;
		}
		else {
			break;
		}
		}
		sc.close();
		System.out.println(str);
	}

}
