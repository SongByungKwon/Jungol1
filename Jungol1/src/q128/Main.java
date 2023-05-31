package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=0;
		int cut=0;
		
		
		while(true) {
			num=sc.nextInt();
			if(num%3!=0&&num%5!=0) {
				cut++;
			}
			else if(num==0) {
				break;
			}
			
		}
		sc.close();
		System.out.println(cut);

	}

}
