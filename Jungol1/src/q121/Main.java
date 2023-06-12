package q121;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		sc.close();
		
		if(i>0) {
			System.out.println("plus");
		}
		else if(i<0) {
			System.out.println("minus");
		}
		else {
			System.out.println("zero");
		}
		

	}

}
