package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char c = sc.next().charAt(0);
		int num = sc.nextInt();
		sc.close();
		
		if(c=='M') {
			if(num >=18) {
				System.out.println("MAN");
			}
			else {
				System.out.println("BOY");
			}
				
		}
		else if(c=='F'){
			if(num >=18) {
				System.out.println("WOMAN");
			}
			else {
				System.out.println("GIRL");
			}
			
		}

	}

}