package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num[] = new int[100];
		int count =-2;
		for(int i=0; i<100;i++) {
			num[i] = sc.nextInt();
			count++;
			if(num[i]==0) {
				sc.close();
				break;
			}
		}
		for(;count>=0;count--) {
			
			System.out.print(num[count]+" ");
		}
		


}
}
