package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num[]=new int[10];
		int max=0;
		int min=10000;
		for(int i=0; i<num.length;i++) {
			num[i]= sc.nextInt();
			if(num[i]<=99) {
				if(max<num[i]) {
					max=num[i];
				}
			}
			if(num[i]<10000&&num[i]>=100) {
				if(min>num[i]) {
					min=num[i];
				}
			}
		}
		if(max==0) {
			max=100;
		}
		if(min==10000) {
			min=100;
		}
		sc.close();
		System.out.printf("%d %d",max,min);

	}

}
