package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char e= sc.next().charAt(0);
		sc.close();
		
		if(e=='A') {
			System.out.println("Excellent");
		}
		else if(e=='B') {
			System.out.println("Good");
		}
		else if(e=='C') {
			System.out.println("Usually");
		}
		else if(e=='D') {
			System.out.println("Effort");
		}
		else if(e=='F') {
			System.out.println("Failure");
		}
		else  {
			System.out.println("error");
		}
	}
}
