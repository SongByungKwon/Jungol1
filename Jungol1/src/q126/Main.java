package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int cut1=0;
		int cut2=0;
		while(true) {
			int num=sc.nextInt();
			if(num>0) {
				if(num%2==0) {
					cut2++;
				}
				else {
					cut1++;
				}
				
			}
			else if(num==0) {
				break;
			}
			
		}
		sc.close();
		System.out.println("odd : "+cut1);
		System.out.println("even : "+cut2);

	}

}
