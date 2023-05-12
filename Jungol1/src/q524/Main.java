package q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		int i2=sc.nextInt();
		sc.close();
		
		boolean a= (i!=0) ? true:false; 
		boolean b= (i2!=0) ? true:false;
		
		boolean c = (a&&b) ? true:false;
		boolean d = (a||b) ? true:false;
		System.out.print(c +" "+d);

	}

}
