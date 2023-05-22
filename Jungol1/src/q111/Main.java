package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jum[] =new int[4];
		int sum=0;
		
		
		for(int i =0; i<jum.length;i++) {
			jum[i]=sc.nextInt();
			sum+=jum[i];
		}
		sc.close();
		System.out.println("sum"+" "+sum);
		System.out.println("avg"+" "+sum/4);
	}

}
