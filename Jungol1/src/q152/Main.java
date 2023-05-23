package q152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a[]= new int[10];
		int odd=0;
		int even=0;
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0; i<a.length;i+=2) {
			odd+=a[i];
			
		}
		for(int j=1; j<a.length;j+=2) {
			even+=a[j];
		}
		System.out.println("odd : "+odd);
		System.out.println("even : "+even);

	}

}
