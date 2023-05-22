package q113;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ga = sc.nextInt()+5;
		int se = sc.nextInt()*2;
		sc.close();
		System.out.println("width"+" "+"="+" "+ga);
		System.out.println("length"+" "+"="+" "+se);
		System.out.println("area"+" "+"="+" "+(ga*se));
		
		

	}

}
