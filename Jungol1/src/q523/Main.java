package q523;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		sc.close();
		
		boolean i = (n1>n2) ? true:false;
		System.out.println(n1 + " > " + n2 + " --- "+ i);
		i = (n1<n2) ? true:false;
		System.out.println(n1 + " < " + n2 + " --- "+ i);
		i = (n1>=n2) ? true:false;
		System.out.println(n1 + " >= " + n2 + " --- "+ i);
		i = (n1<=n2) ? true:false;
		System.out.println(n1 + " <= " + n2 + " --- "+ i);
		

	}

}
