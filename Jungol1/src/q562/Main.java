package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num[] = new int[10];
		int sum=0;
		int avg=0;
		for(int i=0;i<10;i++) {
			num[i]=sc.nextInt();
			if(i%2!=0) {
				sum+=num[i];
			}
			else if(i%2==0) {
			avg+=num[i];
		}
			
	}
		sc.close();
		System.out.printf("sum : %d\n",sum);
		System.out.printf("avg : %.1f\n",avg/(double)5);
		

	}
}
