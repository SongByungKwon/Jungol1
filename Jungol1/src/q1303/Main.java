package q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		sc.close();
		int cnt=1;
		
		for(int i=0;i<num1;i++) {
			if(i>=1) {
				System.out.println();
				}
			for(int j=0;j<num2;j++) {
				System.out.print(cnt+" ");
				cnt++;
			}
		}
	}

}
