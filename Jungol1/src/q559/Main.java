package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double a[] = {85.6,79.5,83.1,80.0,78.2,75.0};
		int i= sc.nextInt();
		int i2= sc.nextInt();
		sc.close();
		
		System.out.printf("%.1f",a[i-1]+a[i2-1]);

	}

}
