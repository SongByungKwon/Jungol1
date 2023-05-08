package q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		System.out.printf("sum : %d\n",num1+num2+num3);
//		System.out.printf("avg : %d\n",(num1+num2+num3)/3);
		int []num = new int[3];
		for(int i=0;i<num.length;i++) {
			num[i] =sc.nextInt();
		}
		sc.close();
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		int sum=0;
		for(int i= 0; i<num.length;i++) {
			sum += num[i];
		}
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+(sum/num.length));

	}

}
